package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC_LOB_Categorization_V7 extends GW_GetDriver {

	@Test
	public void CC_LOBCategorizationV7_ExcessCasualty() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessCasualtyBermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessFinancialInstitutions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessFinancialInstitutionsBermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_CommercialAutoLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_ErrorsOmissions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_GeneralLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityAlliedProviders_MedicalProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_AbuseMolestation() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_CommercialAutoLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_ErrorsOmissions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_GeneralLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityFacility_MedicalProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_AbuseMolestation() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_CommercialAutoLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_ErrorsOmissions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_GeneralLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitals_MedicalProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_MedicalProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_PunitiveDamages() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_ErrorsOmissions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_GeneralLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_GeneralLiabilityCombinedPrem() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_PremisesAndOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_ProductsCompletedOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityHospitalsBermuda_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_MedicalProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_PunitiveDamages() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_ErrorsOmissions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_GeneralLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_GeneralLiabilityCombinedPrem() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_PremisesAndOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_ProductsCompletedOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityMiscellaneousHealthcareBermuda_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityPunitiveDamagesHealthcareBermuda_PunitiveDamages() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessLiabilityPunitiveDamagesHealthcareBermuda_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_Crime() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_DirectorsOfficersLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_EmploymentPracticesLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_FiduciaryLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_NonCommercialManagementLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_SideADIC() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_SideAOnly() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiability_WageHour() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_DirectorsOfficersLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_SideADIC() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_SideAOnly() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_EmploymentPracticesLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_WageHour() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_Crime() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_FiduciaryLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessManagementLiabilityBermuda_NonCommercialManagementLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_InsuredBrokerDealerLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_InsuredRegistered() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_BrokerDealerLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_ESOPServicesLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_InsuranceAgents() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_AccountantsLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_TechnologyLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_LawyersLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_MiscellaneousLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_MediaLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_ExcessProfessionalLiabilityBermuda_ConsultantsLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicy();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PoliticalRiskCredit_ContractFrustrationNonHonoring() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim

		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PoliticalRiskCredit_CreditInsurance() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim

		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PoliticalRiskCredit_InfrastructureFinance() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim

		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PoliticalRiskCredit_MobileAssetFinance() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim

		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PoliticalRiskCredit_PoliticalRiskInvestment() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim

		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_AbuseMolestation() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_DamageToPremisesRentedToYou() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_EmployeeBenefitsLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_GeneralLiabilityCombined() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_HiredAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_ManagedCare() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_MedicalExpense() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_NonMedicalEO() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_PersonalAndAdvertisingInjury() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_PremisesAndOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_ProductsCompletedOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_ProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityAlliedProviders_StopGap() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_AbuseMolestation() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_CertifiedActsOfTerrorism() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_DamageToPremisesRentedToYou() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_EmployeeBenefitsLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_ExtendedReportingPeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_GeneralLiabilityCombined() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_HiredAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_NonOwnedAuto() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_ManagedCare() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_MedicalExpense() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_NonMedicalEO() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_PersonalAndAdvertisingInjury() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_PremisesAndOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_ProductsCompletedOperations() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_ProfessionalLiability() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC_LOBCategorizationV7_PrimaryLiabilityFacility_StopGap() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_NewClaimWizard.LOB_CreateUnverfiedPolicyAssignGroup();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
