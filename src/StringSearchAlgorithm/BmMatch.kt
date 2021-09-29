package StringSearchAlgorithm



fun bmMatch(txt : String, pat : String ) : Int {
    var pt : Int
    var pp : Int
    val txtLen = txt.length
    val patLen = pat.length
    val skip = IntArray(Character.MAX_VALUE.code + 1)

    for(ptt in 0.. Character.MAX_VALUE.code)
        skip[ptt] = patLen
    for(ptt in 0 until (patLen-1))
        skip[pat[ptt].code] = patLen - ptt - 1
    pt = patLen -2
    while(pt < txtLen){
        pp = patLen -1
        while(txt[pt] == pat[pp]){
            if(pp == 0)
                return pt
            pp--
            pt--
        }
        pt += if(skip[txt[pt].code]> patLen - pp) skip[txt[pt].code] else patLen-pp
    }
    return -1
}