import java.util.Stack

// '(' and ')'
// '{' and '}'
// '[' and ']'
fun isValidParentheses(s: String): Boolean {
    if (s.length < 2) return false
    val stack = Stack<Char>()
    val mapChar = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']'
    )

    for (char in s) {
        if (char in mapChar.keys) {
            stack.push(char)
        } else if (char in mapChar.values) {
            if (stack.isEmpty() || char != mapChar[stack.pop()]) return false
        }
    }

    return stack.isEmpty()
}