# Breadth First Search

There are many ways to traverse graphs. BFS is the most commonly used approach.

BFS is a traversing algorithm where you should start traversing from a selected node (source or starting node) and traverse the graph layerwise thus exploring the neighbour nodes (nodes which are directly connected to source node). You must then move towards the next-level neighbour nodes.

As the name BFS suggests, you are required to traverse the graph breadthwise as follows:

1] First move horizontally and visit all the nodes of the current layer
2] Move to the next layer

## Output

a -> [b, g, d]

b -> [a, e, f]

c -> [h]

d -> [a, f]

e -> [b, g]

f -> [b, d, c]

g -> [e, a]

h -> []

Breadth First Search: [a, b, g, d, e, f, c, h]
