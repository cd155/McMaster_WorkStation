# System Engineering Brainstormed List for Drasil

1. General Greedy Approach/Algorithm
    - https://en.wikipedia.org/wiki/Greedy_algorithm
    - Greedy algorithm is a method to find the local optimal solution in the current stage. Finding a suboptimal solution usually is much cheap than finding the optimal solution. Greedy algorithm usually will bring an accepted solution at a relatively low cost.

2. Dijkstra Algorithm
    - This is a very classic algorithm to find the shortest path between X to Y in a node graph. Each node will connect to other nodes with a distance assigned in the connection.

3. Solving Aggregate Planning Problem
    - The objective is to determine values of n nonnegative real variables in order to maximize or minimize a linear function of these variables that is subject to m linear constraints of these variables.
    - The total cost equal to sum all the all costs, and the goal is to minimize the cost with constraints.

4. EOQ model (Economic Order Quantity Model)
    - It is the ideal order quantity a company should purchase to minimize inventory costs such as holding costs, shortage costs, and order costs.
    - This model helps to minimize the total holding costs and ordering costs.
    - Q = square root of (2KD/h), Q is the economic order quantity, setup cost at K per positive order placed, holding cost at h per unit held per unit time, the demand rate is known and is a constant D units per unit time.

5. Find the Bottleneck in a Process
    - In each process, there could be a bottleneck. Eg, in the supermarket, when we check out, a cashier will start counting items, and another staff will help to package items. The bottleneck could happen in either cashier or packaging staff if either one is too slow or too quick to finish the task.

6. Queuing Thoery, Lillte's Law
    - https://en.wikipedia.org/wiki/Little%27s_law
    - l = lambda * w
    - Where
        - l = Expected number of customers in the system in steady state.
        - lambda = Arrival rate to system.
        - w = Expected time a customer spends in the system in steady state.
    - Example1: Average two graduate students will start a study with one professor each year. Each graduate student will spend 1 year and a half to finish the program. According to Lillte's Law, each professor has average three graduate students who are currently studying the program.
    - Example2: if customers arrive at the rate of 2 per minute and each spends an average of 5 minutes in the system, then there will be 10 customers in the system on average. 

7. Operation Scheduling Analysis, eg, how sequencing affect the tardiness
    - First-come, first-served
    - Shortest processing time
    - Earliest due date
    - Critical ratio

    - Example:
        - Job1 has a processing time 11 days, and due date 61
        - Job2 has a processing time 29 days, and due date 45
        - Job3 has a processing time 31 days, and due date 31
        - Job4 has a processing time 1 days, and due date 33
        - Job5 has a processing time 2 days, and due date 32
    - Each rule of sequences will impact the tardiness.

8. Hungarian Algorithm for Assignment Problems
    - The Hungarian Algorithm uses a matrix to solving assignment problems, and minimize the costs.
    - Eg, four machines need to be assembled in four different locations. The company charged different prices based on machine type and its location, how to minimize the cost of assembling those machines.
    - https://en.wikipedia.org/wiki/Hungarian_algorithm