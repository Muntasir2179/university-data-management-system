import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FileOperationsForTeacher implements Operations{

	// add method for teacher
	public void add(Object inputTeacher) {
		try {
			boolean found = false;

			File file = new File("TeacherData.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			
			Teacher readTeacher;
			
			while (raf.getFilePointer() < raf.length()) {
				readTeacher = new Teacher(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine()
						,raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine(),raf.readLine());

				if (((Teacher)inputTeacher).getId().equals(readTeacher.getId())) {
					found = true;
					break;
				}
			}

			if (found == false) {
				raf.writeBytes(((Teacher)inputTeacher).getDataInFileFormate());
				raf.writeBytes(System.lineSeparator());
				
				//JOptionPane.showMessageDialog(null, "Teacher added.");

				raf.close();
			} else {
				JOptionPane.showMessageDialog(null, "The record already exixts.");
				raf.close();
			}
		} catch (IOException  e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		}
}


	// read all teacher data
	@SuppressWarnings("finally")
	public ArrayList<Teacher> display() {
		ArrayList<Teacher> list = new ArrayList<>();
		try {
			File file = new File("TeacherData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				Teacher readTeacher;

				while (raf.getFilePointer() < raf.length()) {
					readTeacher = new Teacher(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine()
							,raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine(),raf.readLine());
					list.add(readTeacher);
				}

				raf.close();
				
				return list;
			}

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally {
			return list;
		}
	}

	// method for edit teacher data
	public void edit(Object teacher) {
		try {
			File file = new File("TeacherData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException();
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				// creating temporary file
				File tempFile = new File("temp.txt");
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");
				if (!tempFile.exists()) {
					System.out.print("File not created.");
					tempFile.createNewFile();
				}

				boolean found = false;
				Teacher readTeacher;

				while (raf.getFilePointer() < raf.length()) {
					readTeacher = new Teacher(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine()
							,raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine(),raf.readLine());

					if (((Teacher)teacher).getId().equals(readTeacher.getId())) {
						tempRaf.writeBytes(((Teacher)teacher).getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());

						found = true;
					} else {
						tempRaf.writeBytes(readTeacher.getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());
					}
				}

				raf.close();
				tempRaf.close();

				file.delete();
				tempFile.renameTo(file);
				
				if (found == true) {
					JOptionPane.showMessageDialog(null, "Edited successfully.");
				} else {
					JOptionPane.showMessageDialog(null, "Data not found.");
				}
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException | ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		} 
	}

	// search method for teacher
	@SuppressWarnings("finally")
	public Teacher search(String searchId) {
		Teacher readTeacher = null;
		try {
			File file = new File("TeacherData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				boolean found = false;
				RandomAccessFile raf = new RandomAccessFile(file, "rw");				

				while (raf.getFilePointer() < raf.length()) {
					readTeacher = new Teacher(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine()
							,raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine(),raf.readLine());

					if (searchId.equals(readTeacher.getId())) {
						found = true;
						break;
					}
				}

				if (found == false) {
					readTeacher = null;
					JOptionPane.showMessageDialog(null, "Data not found.");
				}else {
					JOptionPane.showMessageDialog(null, "Data found.");
				}

				raf.close();
			}
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");
		}catch (IOException | ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		}finally {
			return readTeacher;
		}
	}

	// delete method for teacher
	@SuppressWarnings("finally")
	public Teacher delete(String deleteId) {
		Teacher deletedTeacher = null;
		try {
			
			File file = new File("TeacherData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				boolean found = false;
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				File tempFile = new File("Temp.txt");
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");

				Teacher readTeacher;

				while (raf.getFilePointer() < raf.length()) {
					readTeacher = new Teacher(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine()
							,raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine(),raf.readLine());

					if (deleteId.equals(readTeacher.getId())) {
						found = true;
						deletedTeacher = readTeacher;
					} else {
						tempRaf.writeBytes(readTeacher.getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());
					}
				}
				
				raf.close();
				tempRaf.close();

				file.delete();
				tempFile.renameTo(file);

				if (found == false) {
					JOptionPane.showMessageDialog(null, "Data not found.");
				} else {
					JOptionPane.showMessageDialog(null, "Data deleted successfully.");
				}
				
				//deleting login account
				File logFile = new File("LoginData.txt");
				if(logFile.exists()) {
					RandomAccessFile logRaf = new RandomAccessFile(logFile, "rw");
					
					File logTempFile = new File("TempLoginData.txt");
					logTempFile.createNewFile();
					RandomAccessFile logRafTemp = new RandomAccessFile(logTempFile,"rw");
					boolean logDeleted = false;
					
					while(logRaf.getFilePointer() < logRaf.length()) {
						String[] data = {logRaf.readLine(), logRaf.readLine(), logRaf.readLine()};
						if(data[0].equals(deleteId) && data[2].equals("teacher")) {
							logDeleted = true;
						}else {
							logRafTemp.writeBytes(data[0]+"\r\n"+data[1]+"\r\n"+data[2]);
							logRafTemp.writeBytes(System.lineSeparator());
						}
					}
					
					logRaf.close();
					logRafTemp.close();
					logFile.delete();
					logTempFile.renameTo(logFile);
				}
			}
		} catch (IOException | ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		} finally {
			return deletedTeacher;
		}
	}

	// returns date in such format that the SimpleDateFormat class need
	public String getDateInStringFormat(String readDate) {
		String[] strings = readDate.split(" ");

		String date = strings[2] + "/";

		if (strings[1].equals("Jan"))
			date += "01";
		else if (strings[1].equals("Feb"))
			date += "02";
		else if (strings[1].equals("Mar"))
			date += "03";
		else if (strings[1].equals("Apr"))
			date += "04";
		else if (strings[1].equals("May"))
			date += "05";
		else if (strings[1].equals("Jun"))
			date += "06";
		else if (strings[1].equals("Jul"))
			date += "07";
		else if (strings[1].equals("Aug"))
			date += "04";
		else if (strings[1].equals("Sep"))
			date += "09";
		else if (strings[1].equals("Oct"))
			date += "10";
		else if (strings[1].equals("Nov"))
			date += "11";
		else
			date += "12";

		return date += "/" + strings[5];
	}
}
