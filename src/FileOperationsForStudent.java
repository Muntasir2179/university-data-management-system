import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class FileOperationsForStudent implements Operations{

	// add method for student
	public void add(Object std) throws InputMismatchException {
		boolean found = false;
		try {
			File file = new File("StudentData.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			RandomAccessFile raf = new RandomAccessFile(file, "rw");// Opening file in reading and write mode.

			while (raf.getFilePointer() < raf.length()) {

				Student exStudent = new Student(raf.readLine(), raf.readLine(), raf.readLine(), raf.readLine(),
						raf.readLine(), getDateInStringFormat(raf.readLine()), raf.readLine(), raf.readLine(),
						raf.readLine(), raf.readLine(), raf.readLine());

				if (exStudent.getName().equals(((Student) std).getName())
						|| exStudent.getId().equals(((Student) std).getId())) {
					found = true;
					break;
				}
			}

			if (found == false) {
				File idListFile = new File("StudentIdList.txt");
				RandomAccessFile idListRaf = new RandomAccessFile(idListFile, "rw");

				idListRaf.seek(idListRaf.length());
				idListRaf.writeBytes(((Student) std).getId());
				idListRaf.writeBytes(System.lineSeparator());

				idListRaf.close();

				raf.writeBytes(((Student) std).getDataInFileFormate());// writing the input data in file
				raf.writeBytes(System.lineSeparator());
				found = true;

				JOptionPane.showMessageDialog(null, "Student Added.");

				raf.close();
			} else {
				found = false;
				raf.close();
				JOptionPane.showMessageDialog(null, "This student exists already.");
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	// read all student method
	@SuppressWarnings("finally")
	public ArrayList<Student> display() throws IOException, ParseException {
		ArrayList<Student> list = new ArrayList<>();
		try {
			File file = new File("StudentData.txt");
			if (!file.exists()) {
				System.out.print("File doesn't exists.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				while (raf.getFilePointer() < raf.length()) {
					list.add(new Student(raf.readLine(), raf.readLine(), raf.readLine(), raf.readLine(), raf.readLine(),
							getDateInStringFormat(raf.readLine()), raf.readLine(), raf.readLine(), raf.readLine(),
							raf.readLine(), raf.readLine()));// reading first 11 lines and creating Student object
				}
				raf.close();

				return list;
			}
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			return list;
		}
	}

	// edit student method
	public void edit(Object std) {
		boolean found = false;
		try {
			File file = new File("StudentData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				// creating temporary file
				File tempFile = new File("temp.txt");
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");

				if (!tempFile.exists()) {
					System.out.print("File not created.");
					tempFile.createNewFile();
				}

				Student readStudent = new Student();

				while (raf.getFilePointer() < raf.length()) {
					readStudent = new Student(raf.readLine(), raf.readLine(), raf.readLine(), raf.readLine(),
							raf.readLine(), getDateInStringFormat(raf.readLine()), raf.readLine(), raf.readLine(),
							raf.readLine(), raf.readLine(), raf.readLine());

					if (((Student) std).getId().equals(readStudent.getId())) {
						tempRaf.writeBytes(((Student) std).getDataInFileFormate());// writing the input data in temp
																					// file
						tempRaf.writeBytes(System.lineSeparator());

						found = true;
					} else {
						tempRaf.writeBytes(readStudent.getDataInFileFormate());// writing the input data in temp file
						tempRaf.writeBytes(System.lineSeparator());
					}
				}
				
				raf.close();
				tempRaf.close();

				file.delete();
				tempFile.renameTo(file);
				
				if (found == true) {
					JOptionPane.showMessageDialog(null, "Edit successfull.");
				} else {
					JOptionPane.showMessageDialog(null, "Data not found.");
				}
			}

		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} catch (ParseException e) {
			System.out.print(e.getMessage());
		}
	}

	
	
	
	// delete method for student
	@SuppressWarnings({ "finally", "resource" })
	public Student delete(String deleteId) {
		boolean deleted = false;
		Student readStudent = null;
		Student deletedStudent = null;
		try {
			File file = new File("StudentData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				// creating temporary file
				File tempFile = new File("temp.txt");
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");
				if (!tempFile.exists()) {
					throw new FileNotFoundException("File not found.");
				}

				

				while (raf.getFilePointer() < raf.length()) {

					readStudent = new Student(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							getDateInStringFormat(raf.readLine()), raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							raf.readLine());

					if (!(deleteId.equals(readStudent.getId()))) {

						tempRaf.writeBytes(readStudent.getDataInFileFormate());// writing the input data in temp file
						tempRaf.writeBytes(System.lineSeparator());
					} else {
						deleted = true;
						deletedStudent = readStudent;
					}
				}

				raf.close();
				tempRaf.close();
				file.delete();
				tempFile.renameTo(file);
				
				if(deleted == true) {
					JOptionPane.showMessageDialog(null, "Student deleted.");
				}else {
					JOptionPane.showMessageDialog(null, "Student not found.");
				}
				//student data deleted successfully
				
				//deleting id from IdList
				File idListFile = new File("StudentIdList.txt");
				if( idListFile.exists()) {
					RandomAccessFile idListRaf = new RandomAccessFile(idListFile,"rw");
					
					File idListFileTemp = new File("TempStudentIdList.txt");
					idListFileTemp.createNewFile();
					RandomAccessFile idListRafTemp = new RandomAccessFile(idListFileTemp, "rw");
					
					String readId;
					boolean idDeletedfromList = false;
					
					while(idListRaf.getFilePointer() < idListRaf.length()) {
						readId = idListRaf.readLine();
						
						if( deleteId.equals(readId) ) {
							idDeletedfromList = true;
						}else {
							idListRafTemp.writeBytes(readId);
							idListRafTemp.writeBytes(System.lineSeparator());
						}
					}
					
					idListRaf.close();
					idListRafTemp.close();
					
					idListFile.delete();
					idListFileTemp.renameTo(idListFile);
					
				}//id deleted from the list
				
				
				//deleting students marks
				File markFile = new File("StudentMarks.txt");
				if(markFile.exists()) {
					RandomAccessFile markRaf = new RandomAccessFile(markFile, "rw");
					
					File markFileTemp = new File("TempStudentMarks.txt");
					RandomAccessFile markRafTemp = new RandomAccessFile(markFileTemp,"rw");
					
					boolean deletedMark = false;
					StudentMarks stdMark;
					
					while(markRaf.getFilePointer() < markRaf.length()) {
						stdMark = new StudentMarks(markRaf.readLine(), Double.parseDouble(markRaf.readLine()),
								Double.parseDouble(markRaf.readLine()) , Double.parseDouble(markRaf.readLine())
								, Double.parseDouble(markRaf.readLine()), Double.parseDouble(markRaf.readLine()));
						
						if(stdMark.getId().equals(deleteId)) {
							deletedMark = true;
						}else {
							markRafTemp.writeBytes(stdMark.getDataInFileFormate());
							markRafTemp.writeBytes(System.lineSeparator());
						}
					}
					
					markRaf.close();
					markRafTemp.close();
					markFile.delete();
					markFileTemp.renameTo(markFile);
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
						if(data[0].equals(deleteId) && data[2].equals("student")) {
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
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} catch (ParseException e) {
			System.out.print(e.getMessage());
		}finally {
			return deletedStudent;
		}
	}

	// search method for student
	@SuppressWarnings("finally")
	public Student search(String searchId) {
		boolean found = false;
		Student readStudent = new Student();
		try {
			File file = new File("StudentData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				while (raf.getFilePointer() < raf.length()) {

					readStudent = new Student(raf.readLine(), raf.readLine(), raf.readLine(), raf.readLine(),
							raf.readLine(), getDateInStringFormat(raf.readLine()), raf.readLine(), raf.readLine(),
							raf.readLine(), raf.readLine(), raf.readLine());

					if (searchId.equals(readStudent.getId())) {
						found = true;
						break;
					}
				}
				raf.close();
				if (found == true) {
					JOptionPane.showMessageDialog(null, "Student found.");
					return readStudent;
				} else {
					JOptionPane.showMessageDialog(null, "Student not found.");
					readStudent = null;
				}
			}

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.out.println();
		} catch (IOException | ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		} finally {
			return readStudent;
		}
	}

	//add method for marks
	public void addMarks(StudentMarks stdMark) {
		boolean idFound = false, check = true;
		try {
			File idListFile = new File("StudentIdList.txt");
			RandomAccessFile idListRaf = new RandomAccessFile(idListFile, "rw");

			String readId;

			while (idListRaf.getFilePointer() < idListRaf.length()) {
				readId = idListRaf.readLine();
				if (readId.equals(stdMark.getId())) {
					idFound = true;
					break;
				}
			}
			
			idListRaf.close();

			if (idFound == true) {
				File file = new File("StudentMarks.txt");
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				StudentMarks readStdMark;

				while (raf.getFilePointer() < raf.length()) {
					readStdMark = new StudentMarks(raf.readLine(), Double.parseDouble(raf.readLine()),
							Double.parseDouble(raf.readLine()), Double.parseDouble(raf.readLine()),
							Double.parseDouble(raf.readLine()), Double.parseDouble(raf.readLine()));

					if (readStdMark.getId().equals(stdMark.getId())) {
						check = false;
						break;
					}
				}
				if (check == true) {
					raf.seek(raf.length());
					raf.writeBytes(stdMark.getDataInFileFormate());
					raf.writeBytes(System.lineSeparator());
					raf.close();

					JOptionPane.showMessageDialog(null, "Student's mark added.");
				} else {
					JOptionPane.showMessageDialog(null, "This student's mark already added.");
				}
			} else {
				JOptionPane.showMessageDialog(null,"Can't add marks because the student is not in the student information.");
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Invalid data incountered.");
		}
	}
	
	//search method for Marks
	@SuppressWarnings("finally")
	public StudentMarks searchMarks(String searchId) {
		StudentMarks stdMark = null;
		try {
			File file = new File("StudentMarks.txt");
			if(!file.exists()) {
				throw new FileNotFoundException("File not found.");
			}else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");
				
				while(raf.getFilePointer() < raf.length()) {
					stdMark = new StudentMarks(raf.readLine(), Double.parseDouble(raf.readLine()),
							Double.parseDouble(raf.readLine()), Double.parseDouble(raf.readLine()),
							Double.parseDouble(raf.readLine()), Double.parseDouble(raf.readLine()));
					
					if(stdMark.getId().equals(searchId)) {
						raf.close();
						return stdMark;
					}
				}
				stdMark = null;
			}
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally {
			return stdMark;
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
