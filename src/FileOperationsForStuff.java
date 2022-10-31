import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FileOperationsForStuff implements Operations{
	// add method for stuff
	public void add(Object inputStuff) {
		boolean found = false, check = false;
		try {
			File file = new File("StuffData.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			Stuff readStuff;

			while (raf.getFilePointer() < raf.length()) {
				readStuff = new Stuff(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
						raf.readLine() ,getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine());
				if (((Stuff)inputStuff).getId().equals(readStuff.getId())) {
					found = true;
				}
				if (((Stuff)inputStuff).getPhoneNumber().equals(readStuff.getPhoneNumber())
						|| ((Stuff)inputStuff).getGmail().equals(readStuff.getGmail())) {
					check = true;
					break;
				}
			}

			if (found == false && check == false) {
				raf.writeBytes(((Stuff)inputStuff).getDataInFileFormate());
				raf.writeBytes(System.lineSeparator());

				JOptionPane.showMessageDialog(null, "Stuff data added.");

				raf.close();
			} else if (found == false && check == true) {
				JOptionPane.showMessageDialog(null, "Invalid phone number or gmail.");

				raf.close();
			} else {
				JOptionPane.showMessageDialog(null, "The record already exixts.");
				raf.close();
			}
		} catch (IOException | ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		}
	}

	// search method for stuff
	@SuppressWarnings("finally")
	public Stuff search(String id) {
		Stuff readStuff = null;
		try {
			File file = new File("StuffData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				boolean found = false;
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				while (raf.getFilePointer() < raf.length()) {
					readStuff = new Stuff(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							raf.readLine() ,getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine());
					if (id.equals(readStuff.getId())) {
						found = true;
						break;
					}
				}

				raf.close();
				
				if (found == true) {
					JOptionPane.showMessageDialog(null, "Data found.");
					return readStuff;
				} else {
					JOptionPane.showMessageDialog(null, "Data not found.");
				}
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (ParseException | IOException e) {
			JOptionPane.showMessageDialog(null,"Invalid data encountered.");
		} finally {
			return readStuff;
		}
	}

	//edit method for stuff
	public void edit(Object editStuff) {
		try {
			File file = new File("StuffData.txt");
			if(!file.exists()) {
				throw new FileNotFoundException("File not found.");
			}else {
				RandomAccessFile raf = new RandomAccessFile(file,"rw");
				Stuff readStuff;
				boolean found = false;
				
				//creating temporary file
				File tempFile = new File("temp.txt");
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");
				
				while(raf.getFilePointer() < raf.length()) {
					readStuff = new Stuff(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							raf.readLine() ,getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine());
					
					if(((Stuff)editStuff).getId().equals(readStuff.getId())) {
						found = true;
						tempRaf.writeBytes(((Stuff)editStuff).getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());
					}else {
						tempRaf.writeBytes(readStuff.getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());
					}
				}
				
				raf.close();
				tempRaf.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				if(found == true) {
					JOptionPane.showMessageDialog(null, "Edited successfully.");
				}else {
					JOptionPane.showMessageDialog(null, "Data not found.");
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//method for displaying all stuff's data
	@SuppressWarnings("finally")
	public ArrayList<Stuff> display() {
		ArrayList<Stuff> list = new ArrayList<>();
		try {
			File file = new File("StuffData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("File not found.");
			} else {
				RandomAccessFile raf = new RandomAccessFile(file, "rw");

				Stuff readStuff;

				while (raf.getFilePointer() < raf.length()) {
					list.add(new Stuff(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine()));
				}
				raf.close();
				
				return list;
			}

		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			return list;
		}
	}
	
	//delete method for stuff
	@SuppressWarnings("finally")
	public Stuff delete(String deleteId) {
		Stuff readStuff = null;
		try {
			File file = new File("StuffData.txt");
			if(!file.exists()) {
				throw new FileNotFoundException("File not found.");
			}else {
				RandomAccessFile raf = new RandomAccessFile(file,"rw");
				
				boolean found = false;
				
				//creating temporary file
				File tempFile = new File("temp.txt");
				if(!tempFile.exists()) {
					tempFile.createNewFile();
				}
				RandomAccessFile tempRaf = new RandomAccessFile(tempFile, "rw");
				
				while(raf.getFilePointer() < raf.length()) {
					readStuff = new Stuff(raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),raf.readLine(),
							raf.readLine(),getDateInStringFormat(raf.readLine()),raf.readLine(),raf.readLine());
					
					if(deleteId.equals(readStuff.getId())) {
						found = true;
					}else {
						tempRaf.writeBytes(readStuff.getDataInFileFormate());
						tempRaf.writeBytes(System.lineSeparator());
					}
				}
				
				raf.close();
				tempRaf.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				if(found == true) {
					JOptionPane.showMessageDialog(null, "Deleted successfully.");
				}else {
					JOptionPane.showMessageDialog(null, "Data not found.");
					readStuff = null;
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
						if(data[0].equals(deleteId) && data[2].equals("stuff")) {
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
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (ParseException | IOException e) {
			JOptionPane.showMessageDialog(null,"Invalid data encountered.");
		}finally {
			return readStuff;
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
