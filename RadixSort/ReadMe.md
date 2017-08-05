# RadixSort

Radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value. A positional notation is required, but because integers can represent strings of characters (e.g., names or dates) and specially formatted floating point numbers, radix sort is not limited to integers. Radix sort dates back as far as 1887 to the work of Herman Hollerith on tabulating machines.

Most digital computers internally represent all of their data as electronic representations of binary numbers, so processing the digits of integer representations by groups of binary digit representations is most convenient. Two classifications of radix sorts are least significant digit (LSD) radix sorts and most significant digit (MSD) radix sorts. LSD radix sorts process the integer representations starting from the least digit and move towards the most significant digit. MSD radix sorts work the other way around.

## Efficiency

The topic of the efficiency of radix sort compared to other sorting algorithms is somewhat tricky and subject to quite a lot of misunderstandings. Whether radix sort is equally efficient, less efficient or more efficient than the best comparison-based algorithms depends on the details of the assumptions made. Radix sort complexity is O(wn) for n keys which are integers of word size w. Sometimes w is presented as a constant, which would make radix sort better (for sufficiently large n) than the best comparison-based sorting algorithms, which all perform O(n log n) comparisons to sort n keys. However, in general w cannot be considered a constant: if all n keys are distinct, then w has to be at least log n for a random-access machine to be able to store them in memory, which gives at best a time complexity O(n log n). That would seem to make radix sort at most equally efficient as the best comparison-based sorts (and worse if keys are much longer than log n).

For more detail: https://en.wikipedia.org/wiki/Radix_sort

----------------------------------------------------------------------------------------------------------

## Output

Array: |10 | 15 | 1 | 60 | 5 | 101 | 1001 | 100 | 999 | 25 | 50 | 

Number of times loop runned : 4

Array after Radix sort: |1 | 5 | 10 | 15 | 25 | 50 | 60 | 100 | 101 | 999 | 1001 | 
