package StringSearchAlgorithm

fun main(args : Array<String>){

}

fun kmpMatch(txt : String, pat : String): Int {
    var pt = 1
    var pp = 0
    val skip = IntArray(pat.length +1)

    skip[pt] = 0
    while (pt != pat.length){
        if (pat[pt] == pat[pp])
            skip[++pt] = ++pp
        else if(pp == 0)
            skip[++pt] = pp
        else
            pp = skip[pp]
    }

    pt = 0
    pp = 0
    while(pt != txt.length && pp != pat.length){
        if(txt[pt] == pat[pp]){
            pt++
            pp++
        }else if(pp == 0)
            pt++
        else
            pp = skip[pp]
    }

    if(pp == pat.length)
        return pt - pp
    return -1
}