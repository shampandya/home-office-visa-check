Feature: verify the visa conformation

  @smoke @regression @sanity
  Scenario: anAustralianCominToUKForTourism
    Given I am on start page
    When Click on start button
    And Select a Nationality 'Australia'
    And Click on Continue button
    And Select reason 'Tourism or visiting family and friends'
    And Click on Continue button
    Then verify result 'You will not need a visa to come to the UK'

  @regression
  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
    When Click on start button
    And Select a Nationality 'Chile'
    And Click on Continue button
    And Select reason 'Work, academic visit or business'
    And Click on Continue button
    And Select intendent to stay for longer than 6 months
    And Click on Continue button
    And Select have planning to work for 'Health and care professional'
    And Click on Continue button
    Then verify result 'You need a visa to work in health and care'

  @sanity @regression
  Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    When Click on start button
    And Select a Nationality 'Colombia'
    And Click on Continue button
    And Select reason 'Join partner or family for a long stay'
    And Click on Continue button
    And Select state My partner of family member have uk immigration status 'yes'
    And Click on Continue button
    Then verify result 'You’ll need a visa to join your family or partner in the UK'