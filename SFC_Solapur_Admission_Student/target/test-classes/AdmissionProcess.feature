Feature: AdmissionProcess

  Scenario Outline: Fill detailed personal, address, contact, and other details
    Given User is on the login page
    When User logs in with username "<username>" and password "<password>"
    And User fills in personal details:
      | lastName   | firstName   | middleName   | parentName   | fatherFirstName   | motherName   | nameAsPerMarksheet   | nameAsPerAadhaar   | gender   | dob   | bloodGroup   | aadhaarLast4   | religion   | admissionCategory   | casteCategory   | speciallyAbled   | placeOfBirth   | motherTongue   | maritalStatus   | nationality   | citizenshipCountry  |
      | <lastName> | <firstName> | <middleName> | <parentName> | <fatherFirstName> | <motherName> | <nameAsPerMarksheet> | <nameAsPerAadhaar> | <gender> | <dob> | <bloodGroup> | <aadhaarLast4> | <religion> | <admissionCategory> | <casteCategory> | <speciallyAbled> | <placeOfBirth> | <motherTongue> | <maritalStatus> | <nationality> | <citizenshipCountry |
    And User fills in address details:
      | address   | pincode   | city   | state   | locationArea   | district   | permanentAddressSameAsCorrespondence   | addressPermanent   | pincodePermanent   | cityPermanent   | statePermanent   | locationAreaPermanent   | districtPermanent   | taluka   |
      | <address> | <pincode> | <city> | <state> | <locationArea> | <district> | <permanentAddressSameAsCorrespondence> | <addressPermanent> | <pincodePermanent> | <cityPermanent> | <statePermanent> | <locationAreaPermanent> | <districtPermanent> | <taluka> |
    And User fills in contact details:
      | mobileNumber   | emailID   | guardianName   | guardianOccupation   | guardianNumber   | guardianEmailID   | guardianAnnualIncome   | relationshipWithGuardian   | nomineeFullName   | nomineeDOB   | relationshipWithNominee   | nomineeAge   |
      | <mobileNumber> | <emailID> | <guardianName> | <guardianOccupation> | <guardianNumber> | <guardianEmailID> | <guardianAnnualIncome> | <relationshipWithGuardian> | <nomineeFullName> | <nomineeDOB> | <relationshipWithNominee> | <nomineeAge> |
    And User fills in other details:
      | abcID   | employmentStatus   | educationalGap   | registeredVoter   |
      | <abcID> | <employmentStatus> | <educationalGap> | <registeredVoter> |
    And User clicks the save button
    Then User is redirected to the education details page

    Examples: 
      | username  | password |
      | testuser1 | pass123  |
