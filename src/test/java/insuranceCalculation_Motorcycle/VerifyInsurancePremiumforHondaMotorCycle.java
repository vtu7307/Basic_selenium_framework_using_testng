package insuranceCalculation_Motorcycle;

import java.util.HashMap;


import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.Testbase;

public class VerifyInsurancePremiumforHondaMotorCycle extends Testbase {
	 
	
ExcelOperations excel = new ExcelOperations("InsuranceData");	
	

	@Test
	public void insuranceCalculate_HondaTestcase() throws Exception {
		HashMap<String, String> testData = excel.getTestDatainMap(1);
		test.log(Status.INFO,"Testdata used for execution is "+testData);
		  homepage.ClickOnMotorCycle(); 
		  vehData.enterVehicleData(testData);
		  vehData.ClickonNextbuttonAfterVehicldata();
		  insData.EnterInsurancedata(testData);
		  insData.ClickonnextButton(); 
		  prodData.enterProductData(testData);
		  prodData.ClickOnNextButton(); 
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Gold"),testData.get("PriceValidation_Gold"),"Pricing for Gold plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Silver"),testData.get("PriceValidation_Silver"),"Pricing for Silver plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Platinum"),testData.get("PriceValidation_Platinum"),"Pricing for Platinum plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Ultimate"),testData.get("PriceValidation_Ultimate"),"Pricing for Ultimate plan is not Matching.");
		  priceoptions.selectPriceOption(testData.get("SelectOption"));
		  priceoptions.pricenext();
		 
	}
	@Test
	public void insuranceCalculate_VolvoTestCase() throws Exception {
		HashMap<String, String> testData = excel.getTestDatainMap(2);
		test.log(Status.INFO,"Testdata used for execution is "+testData);
		  homepage.ClickOnMotorCycle(); 
		  vehData.enterVehicleData(testData);
		  vehData.ClickonNextbuttonAfterVehicldata();
		  insData.EnterInsurancedata(testData);
		  insData.ClickonnextButton(); 
		  prodData.enterProductData(testData);
		  prodData.ClickOnNextButton(); 
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Gold"),testData.get("PriceValidation_Gold"),"Pricing for Gold plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Silver"),testData.get("PriceValidation_Silver"),"Pricing for Silver plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Platinum"),testData.get("PriceValidation_Platinum"),"Pricing for Platinum plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Ultimate"),testData.get("PriceValidation_Ultimate"),"Pricing for Ultimate plan is not Matching.");
		  priceoptions.selectPriceOption(testData.get("SelectOption"));
		  priceoptions.pricenext();
		 
	}
	@Test
	public void insuranceCalculate_FordMopedTestCase() throws Exception {
		HashMap<String, String> testData = excel.getTestDatainMap(3);
		test.log(Status.INFO,"Testdata used for execution is "+testData);
		  homepage.ClickOnMotorCycle(); 
		  vehData.enterVehicleData(testData);
		  vehData.ClickonNextbuttonAfterVehicldata();
		  insData.EnterInsurancedata(testData);
		  insData.ClickonnextButton(); 
		  prodData.enterProductData(testData);
		  prodData.ClickOnNextButton(); 
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Gold"),testData.get("PriceValidation_Gold"),"Pricing for Gold plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Silver"),testData.get("PriceValidation_Silver"),"Pricing for Silver plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Platinum"),testData.get("PriceValidation_Platinum"),"Pricing for Platinum plan is not Matching.");
		  Assert.assertEquals(priceoptions.getpriceforselectedoption("Ultimate"),testData.get("PriceValidation_Ultimate"),"Pricing for Ultimate plan is not Matching.");
		  priceoptions.selectPriceOption(testData.get("SelectOption"));
		  priceoptions.pricenext();
		 
	}


	 
}
