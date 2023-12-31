# CryptoUtlilities

## Objectives
1. Competence with using NaturalNumber objects and methods.
2. Exposure to using JUnit to test methods.
3. Exposure to the kinds of computations involved in modern cryptography.

## The Problem
Secure communication is a critical feature of the internet. For example, e-commerce would be impractical if financial transactions were not done using encrypted messages, e.g., between a customer and a vendor or between financial institutions. A key (so to speak) to modern secure communication is a beautiful invention called public-key cryptography. In most approaches to public-key cryptography, certain number-theoretic computations are involved in constructing both the "public" and"private" keys that are used to encrypt and decrypt messages for secure communication. (Number theory is the branch of mathematics dealing with mathematical integers, and in this context we are interested only in non-negative integers, so henceforth when we say "number" we mean "non-negative mathematical integer", which is the mathematical model for our NaturalNumbers.) Cryptographic computations typically work with large natural numbers of perhaps 50-100 digits — sound familiar? — and number-theoretic calculations involving greatest common divisors, modular arithmetic (i.e., clock arithmetic), prime numbers, etc.

One popular public-key cryptographic scheme, RSA, is provably secure under the assumption that factoring of such large numbers is so expensive in terms of execution time as to be computationally infeasible in practice. This is no problem for small numbers. For example, it is easy to write a program to determine that the factors of the number 84 (in addition to the trivial factors 1 and 84, of course) are 2, 3, 6, 7, 14, 21, and 42. However, for very large numbers, no one knows how to find even one non-trivial factor efficiently; this is an open problem in number theory and computer science. At the same time, however, RSA relies on the ability to decide efficiently whether such a large number is prime, i.e., whether it has any non-trivial factors at all. You might know only one way to decide whether a given number n is prime: try to factor it, and if there are no factors other than 1 and n then it is prime. This is based directly on the definition: what it means to be a prime number. Perhaps you can see the futility of this approach for use with RSA. For if it is computationally infeasible to factor a large number, then how can you decide efficiently whether a number is prime? That is the question you will explore a bit in this project.

It turns out number theorists know quite a bit about prime numbers — though far less than they would like to know. Here are a few interesting facts about primes that figure into this project, all related in some way to the number-theoretic result known as Fermat's "little" theorem (as distinct from his more famous "last" theorem):

1. If n is prime and 1 < w < n – 1, then w^2 mod n ≠ 1.
2. If n is prime and 0 < w < n, then w^(n – 1) mod n = 1.
3. If n is composite (i.e., not prime) and 1 < w < n, then it is "likely" that w^(n – 1) mod n ≠ 1.

The first fact above implies that, if you can find a number w in the interval [2, n – 2] for which w^2 mod n = 1, then you know n is not prime; i.e., w is a "witness" that n is composite.

The second fact above implies that, if you can find a number w in the interval [1, n – 1] for which w^(n – 1) mod n ≠ 1, then you know n is not prime; i.e., w is a witness that n is composite.

The third fact above implies that, if you cannot find in the interval [2, n – 1] a witness that n is composite, then you should guess (with high likelihood but not certainty) that n is prime.

Your job for this project is to implement a few utility methods that could be used in cryptographic computations of this sort, including one that can generate a huge number that is very likely a prime number.
