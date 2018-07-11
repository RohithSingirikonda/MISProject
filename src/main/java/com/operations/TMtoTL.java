package com.operations;

import com.util.Xls_Reader;

public class TMtoTL {

	public static void main(String[] args) throws InterruptedException {
		
		String TM_SheetName = "TM";
		String TL_SheetName = "TM_Total";
		
		System.out.println(System.getProperty("user.dir"));
		//Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"/src/main/java/com/excel/MISData.xlsx");
		
		Xls_Reader TM_reader = new Xls_Reader("C:/Users/ramya/Desktop/SudhakarSirTraining/MISProject/src/main/java/com/excel/TM_Tracker.xlsx");
		int TM_rowCount = TM_reader.getRowCount("TM");

		Xls_Reader TL_reader = new Xls_Reader("C:/Users/ramya/Desktop/SudhakarSirTraining/MISProject/src/main/java/com/excel/TL_TM_Tracker.xlsx");
		int TL_rowCount = TL_reader.getRowCount("TM_Total");


		for (int rowNum = 2; rowNum <=TM_rowCount; rowNum++) {
			
			String date = TM_reader.getCellData(TM_SheetName, "Date", rowNum);
			String shift = TM_reader.getCellData(TM_SheetName, "Shift", rowNum);
			String name = TM_reader.getCellData(TM_SheetName, "Name", rowNum);
			String ticket_no = TM_reader.getCellData(TM_SheetName, "Ticket No/ Description", rowNum);
			String resolved = TM_reader.getCellData(TM_SheetName, "Resolved", rowNum);
			String old_resolved = TM_reader.getCellData(TM_SheetName, "Resolved old tickets", rowNum);
			String open_pending = TM_reader.getCellData(TM_SheetName, "Open / Pending", rowNum);
			String l1_access = TM_reader.getCellData(TM_SheetName, "L1", rowNum);
			String l3_access = TM_reader.getCellData(TM_SheetName, "L3", rowNum);
			String ba_access = TM_reader.getCellData(TM_SheetName, "BA", rowNum);
			String l2_access = TM_reader.getCellData(TM_SheetName, "L2", rowNum);
			String comm_access = TM_reader.getCellData(TM_SheetName, "COMM-CG", rowNum);
			String skuCG_access = TM_reader.getCellData(TM_SheetName, "SKU-CG", rowNum);
			String schemeCG_access = TM_reader.getCellData(TM_SheetName, "Scheme-CG", rowNum);
			String npcL2_access = TM_reader.getCellData(TM_SheetName, "NPC-L2", rowNum);
			String other_access = TM_reader.getCellData(TM_SheetName, "CPS/MDM/BIW/SAP/WPC", rowNum);
			String L2_name_access = TM_reader.getCellData(TM_SheetName, "Name in L2", rowNum);
			String remarks = TM_reader.getCellData(TM_SheetName, "Remarks", rowNum);
			
			
			System.out.println(date+" "+shift+" "+name+" "+ticket_no+" "+resolved+" "+old_resolved+" "+open_pending+" "+
								l1_access+" "+l3_access+" "+ba_access+" "+l2_access+" "+comm_access+" "+skuCG_access+" "+
								schemeCG_access+" "+npcL2_access+" "+other_access+" "+L2_name_access+" "+remarks);
			
			
			
		 	  TL_reader.setCellData(TL_SheetName, "Date", rowNum, date);
			  TL_reader.setCellData(TL_SheetName, "Shift", rowNum, shift);
			  TL_reader.setCellData(TL_SheetName, "Name", rowNum, name);
			  TL_reader.setCellData(TL_SheetName, "Ticket No/ Description", rowNum, ticket_no);
			  TL_reader.setCellData(TL_SheetName, "Pending from yesterday", rowNum, "0");			  
			  TL_reader.setCellData(TL_SheetName, "Resolved", rowNum, resolved);
			  TL_reader.setCellData(TL_SheetName, "Resolved Pending tickets", rowNum, old_resolved);
			  TL_reader.setCellData(TL_SheetName, "Open / Pending", rowNum, open_pending);
			  TL_reader.setCellData(TL_SheetName, "L1", rowNum, l1_access);
			  TL_reader.setCellData(TL_SheetName, "L3", rowNum, l3_access);
			  TL_reader.setCellData(TL_SheetName, "BA", rowNum, ba_access);
			  TL_reader.setCellData(TL_SheetName, "L2", rowNum, l2_access);
			  TL_reader.setCellData(TL_SheetName, "COMM-CG", rowNum, comm_access);
			  TL_reader.setCellData(TL_SheetName, "SKU-CG", rowNum, skuCG_access);
			  TL_reader.setCellData(TL_SheetName, "Scheme-CG", rowNum, schemeCG_access);
			  TL_reader.setCellData(TL_SheetName, "NPC-L2", rowNum, npcL2_access);
			  TL_reader.setCellData(TL_SheetName, "CPS/MDM/BIW/SAP/WPC", rowNum, other_access);
			  TL_reader.setCellData(TL_SheetName, "Name in L2", rowNum, L2_name_access);
			  TL_reader.setCellData(TL_SheetName, "Remarks", rowNum, remarks);
			 
			  System.out.println("Inserted Successfully");
			 
				 
				//test_data
			}
		System.out.println("\nTotal Data Inserted Successfully");

	}

}
