package in.ahmed.beans;

import in.ahmed.inter.ReportCreator;

public class ReportManager {

	ReportCreator reportCreator; // dependent class object as reference variable

	private int pages;          // dependent object as primitive value

	public ReportManager(int pages) {
		this.pages = pages;
	}

	public ReportManager(ReportCreator reportCreator) {  // constructor
		this.reportCreator = reportCreator;
	}

	public void setReportCreator(ReportCreator reportCreator) { //setter method
		this.reportCreator = reportCreator;
	}

	public void printReport() {
		reportCreator.createdReport(pages);
	}

}
