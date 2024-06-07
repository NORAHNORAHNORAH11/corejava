package methodoverriding;

public class NMBBank extends CentralBank {
	
@Override
void getBankName() {
	System.out.println("NMB BANK");
}

	@Override
	void getInterestRate() {
		System.out.println("20%");
	}
}
