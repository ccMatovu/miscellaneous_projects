const textAreaContent = document.getElementById("text-area");
let text;

let upper = document.getElementById("upper-case");
let lower = document.getElementById("lower-case");
let proper = document.getElementById("proper-case");
let sentence =document.getElementById("sentence-case");
let saveText = document.getElementById("save-text-file");

upper.addEventListener("click", ev => toUpper());
lower.addEventListener("click",ev => toLower());
proper.addEventListener("click",ev => toProper());
sentence.addEventListener("click",ev => toSentence());
saveText.addEventListener("click", ev => download('text.txt',textAreaContent.value));

function toUpper(){
  text = textAreaContent.value.toUpperCase();
  textAreaContent.value = text;
}

function toLower(){
    text = textAreaContent.value.toLowerCase();
    textAreaContent.value = text;
}

function toProper(){
   text = textAreaContent.value;
   text = text.replace(/(^\w|\s\w)/g, m => m.toUpperCase());
   textAreaContent.value = text;
}

function toSentence(){
    text = textAreaContent.value.toLowerCase().split(". ");
    text = text.map((sentence,index) => {
        if(index != text.length -1){
            return sentence.charAt(0).toUpperCase() + sentence.slice(1) +". ";
        }
        return sentence.charAt(0).toUpperCase() + sentence.slice(1);
    });
    textAreaContent.value = text.join('');
}

function download(filename, text) {
    var element = document.createElement('a');
    element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text));
    element.setAttribute('download', filename);

    element.style.display = 'none';
    document.body.appendChild(element);

    element.click();

    document.body.removeChild(element);
}

