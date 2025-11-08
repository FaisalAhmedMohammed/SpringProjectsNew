package in.ahmed.beans;

import in.ahmed.inter.ReportCreator;

public class ReportManager {

	ReportCreator reportCreator;

	private int pages;

	public ReportManager(int pages) {
		this.pages = pages;
	}

	public ReportManager(ReportCreator reportCreator) {
		this.reportCreator = reportCreator;
	}

	public void setReportCreator(ReportCreator reportCreator) {
		this.reportCreator = reportCreator;
	}

	public void printReport() {
		reportCreator.createdReport(pages);
	}

}
