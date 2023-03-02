package machines

import regex._
import dfa._

// Part 1
given Conversion[Char, RegularLanguage] = n => Character(n)

// Part 2
given Conversion[String, RegularLanguage] = n => n.foldRight(Epsilon)((a: Char, b: RegularLanguage) => Concat(Character(a), b))

// Part 3
extension(pre: RegularLanguage)
    def ||(post: RegularLanguage): RegularLanguage = Union(pre, post)
    def ~(post: RegularLanguage): RegularLanguage = Concat(pre, post)
    def <*> : RegularLanguage = Star(pre)
    def <+> : RegularLanguage = Concat(pre, Star(pre))
    def apply(n: Int): RegularLanguage = 
      if n == 0 then Empty
      else Concat(pre, pre(n-1))
// Part 4
    def toDFA(using c: Set[Char]): DFA = regexToDFA(pre, c)

given Conversion[RegularLanguage, DFA] = n => regexToDFA(n, characterOf(n))

def characterOf(n: RegularLanguage): Set[Char] = 
    n match
        case Empty => Set()
        case Epsilon => Set()
        case Character(c) => Set(c)
        case Union(l1, l2) => characterOf(l1) ++ characterOf(l2)
        case Concat(l1, l2) => characterOf(l1) ++ characterOf(l2)
        case Star(l1) => characterOf(l1)
