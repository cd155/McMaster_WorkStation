## Expected ebnefits of modular programming
- managerial
    - work paralle
- flexibility
    - change/improvement without changing others
- comprehensibility
    - understand one module each time, help to understand the whole system eventually

## The modularizations are intended to describe the design decisions
- Kwic index production system
    - The KWIC index system accepts an ordered set of lines, 
    - each line is an ordered set of words, and each word is an ordered set of characters. 
    - Any line may be "circularly shifted" by repeatedly removing the first word and adding it to the end of the line. 
    - The KWIC index system outputs a listing of all circular shifts of all lines in alphabetical order.
- Example 1
    - input: THE COLOUR OF MAGIC
    - output: 
        - COLOUR OF MAGIC THE
        - MAGIC THE COLOUR OF
        - OF MAGIC THE COLOUR
        - THE COLOUR OF MAGIC
- Modularization 1
    1. input: read all input in core
    2. circular shift
    3. alphabetizing: sorting algorithm
    4. output
    5. master control: control sequencing among the other four modules
    - each one is small enough and simple enough to be thoroughly understood and well programmed
    - 
- Modularization 2
    1. Line Storage
    2. Input: read the original lines and call line stroage ti store it internally
    3. Circular Shifter
    4. Alphabetizer
    5. Output
    6. Master Control

## Similarity and difference
- the runnable representation are likely the same
- The algorithms used in both cases might be identical.
- the definitions of those modules, the work assignments, the interfaces and documentation, likely change, work flow.

## Likely change
- Input format
- The decision to have all lines stored in core
- descision pack four characters into a word
- des