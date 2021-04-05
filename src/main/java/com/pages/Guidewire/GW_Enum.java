package com.pages.Guidewire;

enum Guidewire_Tier1_Application {
	PolicyCenter, BillingCenter, ClaimsCenter, ContactManagement, CustomerEngageQuoteandBuy,
	ProducerEngageforSalesforceFinancialServicesCloud, ServiceRepEngageforSalesforceFinancialServicesCloud
}

enum Guidewire_Tier2_Application {
	ClientDataManagement, InfoCenter, DataHub, DigitalSmallBusinessSolution, AppReader
}

enum Guidewire_Portals {
	QuoteandBuy, AccountManagement, ProducerEngage, VendorEngage, ServiceRepEngage
}

enum Guidewire_EdgeAPI {
	PolicyCenter, BillingCenter, ClaimsCenter, ContactManagement
}

enum GW_ProdEnvironment {
	PROD, PREPROD, DR, ODS, EDW
}

enum GW_DeleiveryEnvironment {
	UAT, QA, TIME_TRAVEL, DEV, Sandbox, OOTB
}

enum GW_SharePointURL {
	UAT, QA, TIME_TRAVEL, DEV, Sandbox, OOTB
}

public class GW_Enum {


	public void sjdjkasdh() {
		GW_DeleiveryEnvironment qa = GW_DeleiveryEnvironment.QA;
	}
}
