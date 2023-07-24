object t6 {
  def main(args: Array[String]): Unit = {
    println("Encrypted word: "+cipher(encrypt,"Hello,World z!",3))
    print("Decrypted word: "+cipher(decrypt,"Khoor,Zruog c!",3))
  }

  def encrypt(text:String,shift:Int): String= {
    var encryptedText=""

    for(ch<-text){
      if(ch.isLetter) {
        var base=0
        if(ch.isUpper)
          base=65
        else
          base=97
        encryptedText+=(((ch-base+shift)%26)+base).toChar
      } else
        encryptedText+=ch

    }

    encryptedText
  }

  def decrypt(text: String, shift: Int): String = {
    var decryptedText = ""

    for (ch <- text) {
      if (ch.isLetter) {
        var base = 0
        if (ch.isUpper)
          base = 90
        else
          base = 122
        decryptedText += (((ch - base - shift))%26 + (base)).toChar
      } else
        decryptedText += ch

    }

    decryptedText
  }

  def cipher(f:(String,Int)=>String,text:String,shift:Int): String= {
    f(text,shift)
  }
}

