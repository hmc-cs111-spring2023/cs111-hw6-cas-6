package machines

import regex._
import dfa._

// Part 1
given Conversion[Char, RegularLanguage] = n => Character(n)

// Part 2
given Conversion[String, RegularLanguage] = n => n.foldRight(Epsilon)((a: Char, b: RegularLanguage) => Concat(Character(a), b))

// Part 3a
