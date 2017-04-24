Ruff Banditz - Alitquan Mallick and Nicolas Naing

APCS2 pd4

LAB03-RUVIP?

2017-04-23

# Design

Our ticket.java has six instance variables:

String name- name of ticket submitter

String description - description of problem

boolean resolved - true/false based on whether or not the ticket is solved

String solnDescription - description of solution for problem

int ID - unique number attached to a ticket

int vipLevel - priority attached to each ticket

The user has the option to customize any of ten tickets when the program is run and compiled. 

After modifying the tickets, the user can then choose to use the helpCenter, where the user can either call it quits, 

solve a problem, or go back through the history to see previously solved problems and their descriptions. If the user

chooses to solve the problem, the most important problem is dequeued for solving first. The user can use

cross-reference if and only if a problem was previously solved <b> DO NOT USE IF A PROBLEM WAS ALREADY SOLVED </b> 

The user can also look back into the history. 

# Additional Features

Cross Reference command: This allows the user to quickly search through previously uploaded solutions and 
choose the most likely correct answer by matching words in the descriptions of the two problems. It might 
be inaccurate due to failure to account for simple words such as "the" and "an". But in my experience
(Alitquan), it performs adequately, although improvement can, should, and will be made
