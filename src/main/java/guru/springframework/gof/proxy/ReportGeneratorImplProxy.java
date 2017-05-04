package guru.springframework.gof.proxy;

//ReportGeneratorProxy == ReportGeneratorWrapper

/*
 * The objective of a proxy object is to control the creation of and access to the real object it represents.
 *  A common use of a proxy is to defer the cost of instantiating of an object (that is expensive to create)
 *   until it is actually needed by clients.
 *   
 *   The real object that is expensive to create, requires protection, or running on a remote JVM
 */
public class ReportGeneratorImplProxy implements ReportGenerator {

	//“Prefer composition over inheritance”
	ReportGenerator reportGeneratorImpl;
	private Role accessRole;

	public ReportGeneratorImplProxy(Role accessRole) {
		this.accessRole = accessRole;
	}

	@Override
	public void displayReportTemplate(String reportFormat, int reportEntries) {
		System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat
				+ " format with " + reportEntries + " entries");
	}

	@Override
	public void generateComplexReport(String reportFormat, int reportEntries) {
		// lazy initialization
		if (reportGeneratorImpl == null) {
			reportGeneratorImpl = new ReportGeneratorImpl();
		}
		reportGeneratorImpl.generateComplexReport(reportFormat, reportEntries);
	}

	@Override
	public void generateSensitiveReport() {

		// lazy initialization with role checking
		if (accessRole.getRole().equals("Manager")) {
			if (reportGeneratorImpl == null) {
				reportGeneratorImpl = new ReportGeneratorImpl();
			}
			reportGeneratorImpl.generateSensitiveReport();
		} else {
			System.out.println("You are not authorized to access sensitive reports.");
		}

	}

}
