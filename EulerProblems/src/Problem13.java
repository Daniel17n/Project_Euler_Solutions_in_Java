import java.math.BigInteger;

public class Problem13 {
    public static void main(String[] args) {
        String code = "37107287533902102798797998220837590246510135740250 46376937677490009712648124896970078050417018260538 74324986199524741059474233309513058123726617309629 91942213363574161572522430563301811072406154908250 23067588207539346171171980310421047513778063246676 89261670696623633820136378418383684178734361726757 28112879812849979408065481931592621691275889832738 44274228917432520321923589422876796487670272189318 47451445736001306439091167216856844588711603153276 70386486105843025439939619828917593665686757934951 62176457141856560629502157223196586755079324193331 64906352462741904929101432445813822663347944758178 92575867718337217661963751590579239728245598838407 58203565325359399008402633568948830189458628227828 80181199384826282014278194139940567587151170094390 35398664372827112653829987240784473053190104293586 86515506006295864861532075273371959191420517255829 71693888707715466499115593487603532921714970056938 54370070576826684624621495650076471787294438377604 53282654108756828443191190634694037855217779295145 36123272525000296071075082563815656710885258350721 45876576172410976447339110607218265236877223636045 17423706905851860660448207621209813287860733969412 81142660418086830619328460811191061556940512689692 51934325451728388641918047049293215058642563049483 62467221648435076201727918039944693004732956340691 15732444386908125794514089057706229429197107928209 55037687525678773091862540744969844508330393682126 18336384825330154686196124348767681297534375946515 80386287592878490201521685554828717201219257766954 78182833757993103614740356856449095527097864797581 16726320100436897842553539920931837441497806860984 48403098129077791799088218795327364475675590848030 87086987551392711854517078544161852424320693150332 59959406895756536782107074926966537676326235447210 69793950679652694742597709739166693763042633987085 41052684708299085211399427365734116182760315001271 65378607361501080857009149939512557028198746004375 35829035317434717326932123578154982629742552737307 94953759765105305946966067683156574377167401875275 88902802571733229619176668713819931811048770190271 25267680276078003013678680992525463401061632866526 36270218540497705585629946580636237993140746255962 24074486908231174977792365466257246923322810917141 91430288197103288597806669760892938638285025333403 34413065578016127815921815005561868836468420090470 23053081172816430487623791969842487255036638784583 11487696932154902810424020138335124462181441773470 63783299490636259666498587618221225225512486764533 67720186971698544312419572409913959008952310058822 95548255300263520781532296796249481641953868218774 76085327132285723110424803456124867697064507995236 37774242535411291684276865538926205024910326572967 23701913275725675285653248258265463092207058596522 29798860272258331913126375147341994889534765745501 18495701454879288984856827726077713721403798879715 38298203783031473527721580348144513491373226651381 34829543829199918180278916522431027392251122869539 40957953066405232632538044100059654939159879593635 29746152185502371307642255121183693803580388584903 41698116222072977186158236678424689157993532961922 62467957194401269043877107275048102390895523597457 23189706772547915061505504953922979530901129967519 86188088225875314529584099251203829009407770775672 11306739708304724483816533873502340845647058077308 82959174767140363198008187129011875491310547126581 97623331044818386269515456334926366572897563400500 42846280183517070527831839425882145521227251250327 55121603546981200581762165212827652751691296897789 32238195734329339946437501907836945765883352399886 75506164965184775180738168837861091527357929701337 62177842752192623401942399639168044983993173312731 32924185707147349566916674687634660915035914677504 99518671430235219628894890102423325116913619626622 73267460800591547471830798392868535206946944540724 76841822524674417161514036427982273348055556214818 97142617910342598647204516893989422179826088076852 87783646182799346313767754307809363333018982642090 10848802521674670883215120185883543223812876952786 71329612474782464538636993009049310363619763878039 62184073572399794223406235393808339651327408011116 66627891981488087797941876876144230030984490851411 60661826293682836764744779239180335110989069790714 85786944089552990653640447425576083659976645795096 66024396409905389607120198219976047599490197230297 64913982680032973156037120041377903785566085089252 16730939319872750275468906903707539413042652315011 94809377245048795150954100921645863754710598436791 78639167021187492431995700641917969777599028300699 15368713711936614952811305876380278410754449733078 40789923115535562561142322423255033685442488917353 44889911501440648020369068063960672322193204149535 41503128880339536053299340368006977710650566631954 81234880673210146739058568557934581403627822703280 82616570773948327592232845941706525094512325230608 22918802058777319719839450180888072429661980811197 77158542502016545090413245809786882778948721859617 72107838435069186155435662884062257473692284509516 20849603980134001723930671666823555245252804609722 53503534226472524250874054075591789781264330331690";
        String[] parts = code.split(" ");
        BigInteger  b1     = new BigInteger(parts[1-1]);
        BigInteger  b2     = new BigInteger(parts[2-1]);
        BigInteger  b3     = new BigInteger(parts[3-1]);
        BigInteger  b4     = new BigInteger(parts[4-1]);
        BigInteger  b5     = new BigInteger(parts[5-1]);
        BigInteger  b6     = new BigInteger(parts[6-1]);
        BigInteger  b7     = new BigInteger(parts[7-1]);
        BigInteger  b8     = new BigInteger(parts[8-1]);
        BigInteger  b9     = new BigInteger(parts[9-1]);
        BigInteger  b10   = new BigInteger(parts[10-1]);
        BigInteger  b11   = new BigInteger(parts[11-1]);
        BigInteger  b12   = new BigInteger(parts[12-1]);
        BigInteger  b13   = new BigInteger(parts[13-1]);
        BigInteger  b14   = new BigInteger(parts[14-1]);
        BigInteger  b15   = new BigInteger(parts[15-1]);
        BigInteger  b16   = new BigInteger(parts[16-1]);
        BigInteger  b17   = new BigInteger(parts[17-1]);
        BigInteger  b18   = new BigInteger(parts[18-1]);
        BigInteger  b19   = new BigInteger(parts[19-1]);
        BigInteger  b20   = new BigInteger(parts[20-1]);
        BigInteger  b21   = new BigInteger(parts[21-1]);
        BigInteger  b22   = new BigInteger(parts[22-1]);
        BigInteger  b23   = new BigInteger(parts[23-1]);
        BigInteger  b24   = new BigInteger(parts[24-1]);
        BigInteger  b25   = new BigInteger(parts[25-1]);
        BigInteger  b26   = new BigInteger(parts[26-1]);
        BigInteger  b27   = new BigInteger(parts[27-1]);
        BigInteger  b28   = new BigInteger(parts[28-1]);
        BigInteger  b29   = new BigInteger(parts[29-1]);
        BigInteger  b30   = new BigInteger(parts[30-1]);
        BigInteger  b31   = new BigInteger(parts[31-1]);
        BigInteger  b32   = new BigInteger(parts[32-1]);
        BigInteger  b33   = new BigInteger(parts[33-1]);
        BigInteger  b34   = new BigInteger(parts[34-1]);
        BigInteger  b35   = new BigInteger(parts[35-1]);
        BigInteger  b36   = new BigInteger(parts[36-1]);
        BigInteger  b37   = new BigInteger(parts[37-1]);
        BigInteger  b38   = new BigInteger(parts[38-1]);
        BigInteger  b39   = new BigInteger(parts[39-1]);
        BigInteger  b40   = new BigInteger(parts[40-1]);
        BigInteger  b41   = new BigInteger(parts[41-1]);
        BigInteger  b42   = new BigInteger(parts[42-1]);
        BigInteger  b43   = new BigInteger(parts[43-1]);
        BigInteger  b44   = new BigInteger(parts[44-1]);
        BigInteger  b45   = new BigInteger(parts[45-1]);
        BigInteger  b46   = new BigInteger(parts[46-1]);
        BigInteger  b47   = new BigInteger(parts[47-1]);
        BigInteger  b48   = new BigInteger(parts[48-1]);
        BigInteger  b49   = new BigInteger(parts[49-1]);
        BigInteger  b50   = new BigInteger(parts[50-1]);
        BigInteger  b51   = new BigInteger(parts[51-1]);
        BigInteger  b52   = new BigInteger(parts[52-1]);
        BigInteger  b53   = new BigInteger(parts[53-1]);
        BigInteger  b54   = new BigInteger(parts[54-1]);
        BigInteger  b55   = new BigInteger(parts[55-1]);
        BigInteger  b56   = new BigInteger(parts[56-1]);
        BigInteger  b57   = new BigInteger(parts[57-1]);
        BigInteger  b58   = new BigInteger(parts[58-1]);
        BigInteger  b59   = new BigInteger(parts[59-1]);
        BigInteger  b60   = new BigInteger(parts[60-1]);
        BigInteger  b61   = new BigInteger(parts[61-1]);
        BigInteger  b62   = new BigInteger(parts[62-1]);
        BigInteger  b63   = new BigInteger(parts[63-1]);
        BigInteger  b64   = new BigInteger(parts[64-1]);
        BigInteger  b65   = new BigInteger(parts[65-1]);
        BigInteger  b66   = new BigInteger(parts[66-1]);
        BigInteger  b67   = new BigInteger(parts[67-1]);
        BigInteger  b68   = new BigInteger(parts[68-1]);
        BigInteger  b69   = new BigInteger(parts[69-1]);
        BigInteger  b70   = new BigInteger(parts[70-1]);
        BigInteger  b71   = new BigInteger(parts[71-1]);
        BigInteger  b72   = new BigInteger(parts[72-1]);
        BigInteger  b73   = new BigInteger(parts[73-1]);
        BigInteger  b74   = new BigInteger(parts[74-1]);
        BigInteger  b75   = new BigInteger(parts[75-1]);
        BigInteger  b76   = new BigInteger(parts[76-1]);
        BigInteger  b77   = new BigInteger(parts[77-1]);
        BigInteger  b78   = new BigInteger(parts[78-1]);
        BigInteger  b79   = new BigInteger(parts[79-1]);
        BigInteger  b80   = new BigInteger(parts[80-1]);
        BigInteger  b81   = new BigInteger(parts[81-1]);
        BigInteger  b82   = new BigInteger(parts[82-1]);
        BigInteger  b83   = new BigInteger(parts[83-1]);
        BigInteger  b84   = new BigInteger(parts[84-1]);
        BigInteger  b85   = new BigInteger(parts[85-1]);
        BigInteger  b86   = new BigInteger(parts[86-1]);
        BigInteger  b87   = new BigInteger(parts[87-1]);
        BigInteger  b88   = new BigInteger(parts[88-1]);
        BigInteger  b89   = new BigInteger(parts[89-1]);
        BigInteger  b90   = new BigInteger(parts[90-1]);
        BigInteger  b91   = new BigInteger(parts[91-1]);
        BigInteger  b92   = new BigInteger(parts[92-1]);
        BigInteger  b93   = new BigInteger(parts[93-1]);
        BigInteger  b94   = new BigInteger(parts[94-1]);
        BigInteger  b95   = new BigInteger(parts[95-1]);
        BigInteger  b96   = new BigInteger(parts[96-1]);
        BigInteger  b97   = new BigInteger(parts[97-1]);
        BigInteger  b98   = new BigInteger(parts[98-1]);
        BigInteger  b99   = new BigInteger(parts[99-1]);
        BigInteger  b100  = new BigInteger(parts[100-1]);
        BigInteger result = new BigInteger("0");
        result = b100.add(b99.add(b98.add(b97.add(b96.add(b95.add(b94.add(b93.add(b92.add(b91.add(b90.add(b89.add(b88.add(b87.add(b86.add(b85.add(b84.add(b83.add(b82.add(b81.add(b80.add(b79.add(b78.add(b77.add(b76.add(b75.add(b74.add(b73.add(b72.add(b71.add(b70.add(b69.add(b68.add(b67.add(b66.add(b65.add(b64.add(b63.add(b62.add(b61.add(b60.add(b59.add(b58.add(b57.add(b56.add(b55.add(b54.add(b53.add(b52.add(b51.add(b50.add(b49.add(b48.add(b47.add(b46.add(b45.add(b44.add(b43.add(b42.add(b41.add(b40.add(b39.add(b38.add(b37.add(b36.add(b35.add(b34.add(b33.add(b32.add(b31.add(b30.add(b29.add(b28.add(b27.add(b26.add(b25.add(b24.add(b23.add(b22.add(b21.add(b20.add(b19.add(b18.add(b17.add(b16.add(b15.add(b14.add(b13.add(b12.add(b11.add(b10.add(b9.add(b8.add(b7.add(b6.add(b5.add(b4.add(b3.add(b2.add(b1)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
        System.out.println(result);
    }

}