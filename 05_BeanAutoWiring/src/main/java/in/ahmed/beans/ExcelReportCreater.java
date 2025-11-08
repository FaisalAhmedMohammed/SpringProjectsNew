package in.ahmed.beans;

import in.ahmed.inter.ReportCreator;

public class ExcelReportCreater implements ReportCreator {  //dependency class

	@Override
	public void createdReport(int pages) {
		System.out.println("ExcelReportCreater :: created with : " + pages + " Pages");

	}

}
