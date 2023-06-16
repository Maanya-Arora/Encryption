# Encryption -- and its future
Security protocols provide privacy, authentication, and integrity to Internet communications, through encrypting and decrypting exchanges. As technology such as quantum computing continues to develop, how do we ensure these encryption processes are still secure? What threats are posed when these processes are broken?

---

## From the Quintessence Labs..
> "Funnily, Mahatma Gandhi’s quote fits this perfectly: “First they ignore you (Quantum Computers will never exist), then they  
> laugh at you (really, you can factor the number 35? Cool…), then they fight you, then you win”."

---

# Are we in danger now?

The Scientific American doesn't seem to think so. An article detailing their understanding writes, 
> "The size of a quantum computer is measured in quantum bits, or qubits. Researchers say it might take one million or more qubits > to crack RSA. The largest quantum machine available today—the Osprey chip, announced in November by IBM—has 433 qubits." 

For now, we are safe. Small RSA bit sizes can be cracked easily, even by regular humans and trial and error. However, larger codes just can't be cracked. In addition, many security experts have begun to favor alternatives to RSA, like Eliptic Curve Theory Equation, requiring hackers to compute an elliptic curve discrete logarithm, rather than factoring numbers based on the Diffie-Hellman exchange.

---
![image](data:image/png;base64,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)
For a normal computer, the computation time required to break RSA codes increases as the size of the RSA key increases. This is modeled by the graph shown. 

![image](https://github.com/Maanya-Arora/Encryption/assets/40130525/cdfe7824-faae-4ca0-a354-faac7ae199c9)
Over time, the number of qubits needed to break key exchange algorithms has greatly decreased. 

### So, larger key sizes take longer to break, but who knows how quickly an ideal quantum computer could get the job done?  
Key sizes have needed to get larger because of the demand to make them impenetrable, because these secret keys protect highly personal information, from credit cards details saved on websites to bank account information online. We are secure and comforted in the idea that a regular computer will take 300 trillion years to crack a 2048 bit RSA code. Shor's algorithm makes it clear that 2048 bits is nothing to a quantum computer equipped with 4099 qubits, which simplifies complexity of the problem from exponential complexity (x^N) to polynomial complexity (N^x), where N is bit size. 

---
