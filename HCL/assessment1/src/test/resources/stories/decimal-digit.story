Story: The Decimal Digit

Meta:
@scope interview

Scenario: 1
When the input is 25607
Then the output should look like
20000,5000,600,7

Scenario: 2
When the input is 47821
Then the output should look like
40000,7000,800,20,1

-----candidate-tests-end-----

Scenario: 3
When the input is 987654
Then the output should look like
900000,80000,7000,600,50,4

Scenario: 4
When the input is 20000000
Then the output should look like
20000000

Scenario: 5
When the input is 3020504
Then the output should look like
3000000,20000,500,4

Scenario: 6
When the input is 9
Then the output should look like
9

Scenario: 7
When the input is 30000
Then the output should look like
30000