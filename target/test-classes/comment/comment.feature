Feature: Comment

	Scenario: An audience member can sign in or register to write a comment
		Given I am an audience member
		When I want to add a comment to a BBC News article
		Then Sign in button should exist
		And Register link should exist

	Scenario: When an audience member wants to sign in to their account, they are prompted for their details
		Given I am an audience member
		When I want to add a comment to a BBC News article
		And I want to sign in to my account
		Then Username field should exist
		And Password field should exist
		And Sign in page button should exist

# Manual tests from now on
# Commented so as necessary tests pass without skips

#	Scenario: When an audience member wants to register then they are prompted for their details
#		Given I am an audience member
#		When I want to add a comment to a BBC News article
#		And I want to register a new account
#		Then relevant form fields should exist

#	Scenario: When an audience member wants to sign in to their account, then they are redirected
#		Given I am an audience member
#		When I want to add a comment to a BBC News article
#		And I want to sign in to my account
#		Then I should be redirected to sign in page

#	Scenario: When an audience member wants to register, then they are redirected
#		Given I am an audience member
#		When I want to add a comment to a BBC News article
#		And I want to register a new account
#		Then I should be redirected to register page

#	Scenario: Once signed in, the audience member is able to see the comment box
#		Given I am a signed in audience member
#		When I want to add a comment to a BBC News article
#		Then Comment box should exist
#		And Post button should exist

#	Scenario: Once signed in, the audience member is able to type in the comment box
#		Given I am a signed in audience member
#		When I want to add a comment to a BBC News article
#		Then I can type content in the comment box

#	Scenario: Once signed in, the audience member can post their comment
#		Given I am a signed in audience member
#		When I want to add a comment to a BBC News article
#		And it is accpetable
#		Then I can see my comment