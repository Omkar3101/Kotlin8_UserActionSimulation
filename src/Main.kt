//Project 8 : User Action Simulation


//1. Define  a Data Class:
data class User(val name: String, val email: String)

//2. Create a Sealed Class:
sealed class UserAction

data class Login(val user: User): UserAction()
data class Logout(val user: User): UserAction()
data class Register(val user: User, val referralCode: String? = null): UserAction()

//3. Implement a Function
fun processUserAction(action: UserAction) {
    when(action) {
        is Login -> println("User ${action.user.name} logged in.")
        is Logout -> println("User ${action.user.name} logged out.")
        is Register -> println("User ${action.user.name} registered. Referral: ${action.referralCode?:"None"}")
    }
}

//4. Test your code
fun main() {

}