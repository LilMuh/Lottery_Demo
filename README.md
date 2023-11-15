# Lottery_Demo

        /* RULES:
        There are two colors of balls (Red and Blue) with unique number in the pool. And the customer needs to enter
        a series of number to take a bet of the number that the system draw. The numbers that system draws out are the
        lottery numbers. By comparing the lottery numbers and customers' input, output the prize that customers win.

        * STRUCTURE:
            Each bet: 7 guesses (6 for red ball numbers, 1 for blue ball number)
            Customers can take their own guesses or let the admin generate a bet with random guesses for them.

        * NUMBERS:
            Red ball number: 1-33
            Blue ball number: 1-16

        * PROCESS:
            The number that system draws will be an array with 7 numbers (6 for red balls and 1 for blue).
            (E.g. 30 2 4 14 10 7 2)
            (E.g. 33 9 6 8 19 1 5)

            * In each bet, customers should take 6 guesses about the red ball numbers and 1 for the blue ball number.
            The numbers for red balls should not be the same in each bet, but the number for blue ball can be the
            same with red ball numbers.
            Valid: (17 30 16 9 7 1 1) - First 6 numbers are for red balls and the last one is for blue ball
            Invalid: (17 30 11 9 17 1 6) - 17 is repeated in the red ball guess

            * Every bet costs $10

            Then comparing the guess numbers and the drawn numbers. When the customer successfully guessed a correct
            number, it calls a Win. The number of balls that the customers correctly guessed is related to the level
            of prize.

        * PRIZE:
            - First place: $10,000,000  (Win: 6 red balls + 1 blue ball)
            - Second place: $5,000,000  (Win: 6 red balls + 0 blue ball)
            - Third place: $3,000       (Win: 5 red balls + 1 blue ball)
            - Fourth place: $200        (Win: 5 red balls + 0 blue ball)
                                        (Win: 4 red balls + 1 blue ball)
            - Fifth place: $10          (Win: 4 red balls + 0 blue ball)
                                        (Win: 3 red balls + 1 blue ball)
            - Sixth place: $5           (Win: 2 red balls + 1 blue ball)
                                        (Win: 1 red balls + 1 blue ball)
                                        (Win: 0 red balls + 1 blue ball)
         */
