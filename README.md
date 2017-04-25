Ruff Banditz - Alitquan Mallick and Nicolas Naing

APCS2 pd4

LAB03-RUVIP?

2017-04-23

# Design

Our ticket.java has six private instance variables:

String name- name of ticket submitter

String description - description of problem

boolean resolved - true/false based on whether or not the ticket is solved

String solnDescription - description of solution for problem

int ID - unique number attached to a ticket

int vipLevel - priority attached to each ticket

Thet ticket includes a variety of accessor methods that can access all of these tickets.

# Instructions and Helpdesk Information

To run application, compile and run Helpdesk.java.

One of the limitations of Java as programming language is an inability for a user of an application to dynamically
change the name of a variable. As a result, twelve tickets have initially been initialized and inserted into 
the container of HelpDesk before hand. When HelpDesk is run, you will be prompted to modify tickets or work as a helpDesk.
It is recommended that the user experiment with the tickets.
The user has the option to customize any of twelve tickets when the program is run and compiled. 

After modifying the tickets, the user can then choose to use the helpCenter, where the user can either :
Call it quits, solve a problem, go back through the history to see previously solved problems and their descriptions, or see
the queue of tickets that still need to be solved and have not been verified as to whether or not the helpDesk user
has the capacity to solve them. 

If the user chooses to solve the problem, the most important problem is dequeued for solving first. The user can use
cross-reference if and only if a problem was previously solved. The option will only appear if the user has already solved a problem. 
The user can also look back into the history to see problems and their solutions. When the user chooses to submit a 
solution, that ticket is resolved and removed from the list of problems and the next ticket is accessed for resolution.
Choosing not to solve a problem will move it to a new APQ that contains all tickets that are still unresolved. 

If the user ever wishes to stop using Helpdesk, he/she can just "call it a day" via the option for it

# Additional Features

Cross Reference command: This allows the user to quickly search through previously uploaded solutions and 
choose the most likely correct answer by matching words in the descriptions of the two problems. It might 
be inaccurate due to failure to account for simple words such as "the" and "an". But in my experience
(Alitquan), it performs adequately, although improvement can, should, and will be made

If possible make APQ have generic typing (right now it is specifically for ticket).

if possible Nicholas, how about you actually do work instead of using your status as a 2nd term senior to exploit me?
