package StringSearchAlgorithm


fun main(args:Array<String>){
    val txt = "ABC이지스DEF"
    val pat = "이지스"
    val idx = bfMatch(txt,pat)
    if(idx == -1){
        println("해당 패턴은 텍스트 내에 없습니다.")
        return
    }
    println("${idx +1} 번째 문자열부터 일치합니다.")
    println(String.format("%ds\n",1) + "안녕하세요")



}
fun bfMatch(txt : String, pat : String) : Int {
    var pt = 0
    var pp = 0
    var formatpat = pat
    var formatCursor = "+"
    var iscorrect = false


    while(pt != txt.length && pp != pat.length){
        if(txt[pt] == pat[pp]){
            iscorrect = true
            pt++
            pp++
        }else{
            iscorrect = false
            pt = pt -pp +1
            pp = 0
        }

        if(iscorrect){
            println(txt)
            println(formatCursor)
            println(pat) // +의 위치만 한칸 증가
            formatCursor = " " + "+"
        }else{
//            formatpat.replace("0"," ")
            println(txt)
            println(formatCursor)
            println(formatpat)
            formatCursor = "-"
            // pat의 위치를 한칸 증가
            formatpat = " " + formatpat
            // + - 위치를 pat의 위치로 옮김
        }

    }
    if(pp == pat.length){
        return pt - pp
    }else{
        return -1
    }
}