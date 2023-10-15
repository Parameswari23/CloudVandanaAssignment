function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = [];

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = reverseString(word);
        reversedWords.push(reversedWord);
    }

    return reversedWords.join(' ');
}

function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}


const inputSentence = 'This is a sunny day';
const reversedSentence = reverseWords(inputSentence);
console.log('Reversed sentence:', reversedSentence);
