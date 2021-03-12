The UNIX command `grep` (global search for regular expressions and print) searches lines of text files for substrings that match a regular expression and prints those lines. The symbols of grep expressions are ASCII characters. The _standard regular expressions_ are: 

| regular expression | matching string                                                                           |
|:-------------------|:------------------------------------------------------------------------------------------|
| `c`                | non-operator character `c`                                                                |
| `\c`               | character `c` literally                                                                   |
| `r₁r₂`             | sequence of regular expressions`r₁`, `r₁`                                                 |
| `r*`               | zero or more occurrences of `r`, where `r` is a regular expression for a single character |
| `r\{i,j\}`         | `i` to `j` repetitions of `r`, e.g. `9\{1,3\}` = `9│99│999`                               |
| `[s]`              | character class, e.g. `[ab34] = a│b│3│4` and `[A-Za-z] = A│…│Z│a│…│z`                     |
| `[^s]`             | complemented character class, e.g. `[^0-9]` are all non-digit characters                  |
| `.`                | character class with all characters                                                       |
| `^`                | a fictitious character at the beginning of a line                                         |
| `$`                | a fictitious character at the end of a line                                               |

_Extended regular expressions_ are supported by `grep -E` (or `egrep` in earlier versions of UNIX):

| regular expression | matching string                                                              |
|:-------------------|:-----------------------------------------------------------------------------|
| `r₁│r₂`            | either `r₁` or `r₂`                                                          |
| `r*`               | zero or more occurrences of `r`, where `r` is an extended regular expression |
| `r+`               | one or more occurrences of `r`, same as `rr*`                                |
| `r?`               | zero or one occurrence of `r`                                                |
| `(r)`              | same as `r` (written as `\(r\)` without `-E` option)                         |

Consult the [online manual](https://www.gnu.org/software/grep/manual/grep.html) and the _man page_ by opening a new terminal in Jupyter and typing in `man grep`.