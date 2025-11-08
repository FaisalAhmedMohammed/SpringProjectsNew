package in.ahmed.beans;

import in.ahmed.inter.ReportCreator;

public class pdfReportCreator implements ReportCreator {

	@Override
	public void createdReport(int pages) {
		System.out.println("pdfReportCreator :: created with : "+ pages + " Pages");

	}

}
