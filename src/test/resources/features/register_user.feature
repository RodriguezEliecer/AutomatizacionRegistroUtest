#AUTOR: Eliecer Rodriguez

  @Stories
  Feature: Go to the page of Utest.com and proceed to create a new user.

    @Scenario:
    Scenario Outline: Successfully create a new user
      Given he user accessed the url and selected JOIN TODAY
      When  enter the information required by the form
        | strFirstName   | strLastName   | strEmail   | strBirthMonth   | strBirthDay   | strBirthYear   | strCity   | strZIP   | strCountry   | strDevComputer   | strDevVersion   | strDevLanguage   | strDevMobile   | strDevModel   | strDevOs   | strPassword    | strConfirmPassword   |
        | <strFirstName> | <strLastName> | <strEmail> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strCity> | <strZIP> | <strCountry> | <strDevComputer> | <strDevVersion> | <strDevLanguage> | <strDevMobile> | <strDevModel> | <strDevOs> | <strPassword>  | <strConfirmPassword> |
      Then  registration was successful
        | strCheckEndTitle    |
        | <strCheckEndTitle>  |
      Examples:
        | strFirstName | strLastName | strEmail         | strBirthMonth | strBirthDay | strBirthYear | strCity     | strZIP | strCountry | strDevComputer | strDevVersion     | strDevLanguage |  strDevMobile | strDevModel     | strDevOs     | strPassword    | strConfirmPassword | strCheckEndTitle  |
        | Daniel       | Caballero   | dani223@gnx.com  | July          | 19          | 1990         | Panama City | 507    | Panama     |   Windows      |  Windows 10 Home  |  Spanish       |   Samsung     |  Galaxy S10 5G  |  Android 11  |  bGi9h*iDG9yP  |  bGi9h*iDG9yP      | Complete Setup    |