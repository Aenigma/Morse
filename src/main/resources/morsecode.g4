grammar MorseCode;

morsealpha : (A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|NUM0|NUM1|NUM2|NUM3|NUM4|NUM5|NUM6|NUM7|NUM8|NUM9);

sequence : morsealpha*;

WS: [ \r\n\t] -> skip;

A	: '.-' {System.out.print("A");} ;
B	: '-...'{System.out.print("B");} ;
C	: '-.-.'{System.out.print("C");} ;
D	: '-..'{System.out.print("D");} ;
E	: '.'{System.out.print("E");} ;
F	: '..-.'{System.out.print("F");} ;
G	: '--.'{System.out.print("G");} ;
H	: '....'{System.out.print("H");} ;
I	: '..'{System.out.print("I");} ;
J	: '.---'{System.out.print("J");} ;
K	: '-.-'{System.out.print("K");} ;
L	: '.-..'{System.out.print("L");} ;
M	: '--'{System.out.print("M");} ;
N	: '-.'{System.out.print("N");} ;
O	: '---'{System.out.print("O");} ;
P	: '.--.'{System.out.print("P");} ;
Q	: '--.-'{System.out.print("Q");} ;
R	: '.-.'{System.out.print("R");} ;
S	: '...'{System.out.print("S");} ;
T	: '-'{System.out.print("T");} ;
U	: '..-'{System.out.print("U");} ;
V	: '...-'{System.out.print("V");} ;
W	: '.--'{System.out.print("W");} ;
X	: '-..-'{System.out.print("X");} ;
Y	: '-.--'{System.out.print("Y");} ;
Z	: '--..'{System.out.print("Z");} ;
NUM0	: '-----'{System.out.print("0");} ;
NUM1	: '.----'{System.out.print("1");} ;
NUM2	: '..---'{System.out.print("2");} ;
NUM3	: '...--'{System.out.print("3");} ;
NUM4	: '....-'{System.out.print("4");} ;
NUM5	: '.....'{System.out.print("5");} ;
NUM6	: '-....'{System.out.print("6");} ;
NUM7	: '--...'{System.out.print("7");} ;
NUM8	: '---..'{System.out.print("8");} ;
NUM9	: '----.'{System.out.print("9");} ;

