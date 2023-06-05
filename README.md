# Encryption -- and its future
Security protocols provide privacy, authentication, and integrity to Internet communications, through encrypting and decrypting exchanges. As technology such as quantum computing continues to develop, how do we ensure these encryption processes are still secure? What threats are posed when these processes are broken?

---

## From the Quintessence Labs..
> Funnily, Mahatma Gandhi’s quote fits this perfectly: “First they ignore you (Quantum Computers will never exist), then they  
> laugh at you (really, you can factor the number 35? Cool…), then they fight you, then you win”.

---

# Are we in danger now?

The Scientific American doesn't seem to think so. An article detailing their understanding writes, 
> "The size of a quantum computer is measured in quantum bits, or qubits. Researchers say it might take one million or more qubits > to crack RSA. The largest quantum machine available today—the Osprey chip, announced in November by IBM—has 433 qubits." 

For now, we are safe. Small RSA bit sizes can be cracked easily, even by regular humans and trial and error. However, larger codes just can't be cracked. In addition, many security experts have begun to favor alternatives to RSA, like Eliptic Curve Theory Equation, requiring hackers to compute an elliptic curve discrete logarithm, rather than factoring numbers based on the Diffie-Hellman exchange.

---

![image](https://github.com/Maanya-Arora/Encryption/assets/40130525/cdfe7824-faae-4ca0-a354-faac7ae199c9)
### Larger key sizes take longer to break, but who knows how quickly an ideal quantum computer could get the job done?  
Key sizes have needed to get larger because of the demand to make them impenetrable, because these secret keys protect highly personal information, from credit cards details saved on websites to bank account information online. We are secure and comforted in the idea that a regular computer will take 300 trillion years to crack a 2048 bit RSA code. Shor's algorithm makes it clear that 2048 bits is nothing to a quantum computer equipped with 4099 qubits, which simplifies complexity of the problem from exponential complexity (x^N) to polynomial complexity (N^x), where N is bit size. 

---
