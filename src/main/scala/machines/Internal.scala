package machines

import regex._
import dfa._

// TODO: Add your code below
given Conversion[Char, RegularLanguage] = n => Character(n)

//given Conversion[String, RegularLanguage] = n => Character(n)