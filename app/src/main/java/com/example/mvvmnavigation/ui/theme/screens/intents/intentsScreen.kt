//package com.example.mvvmnavigation.ui.theme.screens.intents
//
//import android.content.Context
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.ListItem
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.ExperimentalComposeUiApi
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.data.EmptyGroup.data
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.android.volley.Request
//import com.android.volley.Response
//import com.android.volley.toolbox.StringRequest
//import com.android.volley.toolbox.Volley
//import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme
//import org.json.JSONArray
//import org.json.JSONException
//
//
//        @OptIn(ExperimentalMaterial3Api::class)
//
//        @Composable
//        fun IntentsScreen(navController: NavController) {
//            // ... (other code)
////            var dataList by remember { mutableStateOf<List<UserData>>(emptyList()) }
//            val context = LocalContext.current
//            Button(
//                onClick = {
////                    getContentFromReadPHP(context = context) { data ->
////                        dataList = data
////                    }
//                }
//            ) {
//                Text(text = "Submit data")
//            }
//
////            Text(
////                text = buildString {
////                    for (userData in dataList) {
////                        append("Id: ${userData.id}, Email: ${userData.email}, " +
////                                "Price: ${userData.price}, Amount: ${userData.amount}, " +
////                                "Payment Number: ${userData.paymentNumber}, " +
////                                "Trades No: ${userData.tradesNo}, Percent: ${userData.percent}\n")
////                    }
////                }
////            )
//        }
//
//fun getContentFromReadPHP(
//    context: Context,
//    onDataReceived: (List<UserData>) -> Unit
//) {
//    val queue = Volley.newRequestQueue(context)
//    val url = "http://192.168.1.3/restapi/api.php"
//
//    val stringRequest = object : StringRequest(
//        Method.GET, "$url",
//        Response.Listener<String> { response ->
//            try {
//                val dataList = mutableListOf<UserData>()
//
//                val jsonArray = JSONArray(response)
//                for (i in 0 until jsonArray.length()) {
//                    val jsonObject = jsonArray.getJSONObject(i)
//                    val id = jsonObject.getString("id")
//                    val email = jsonObject.getString("number")
//                    val price = jsonObject.getString("price")
//                    val amount = jsonObject.getString("amount")
//                    val paymentNumber = jsonObject.getString("paymentnumber")
//                    val tradesNo = jsonObject.getString("tradesno")
//                    val percent = jsonObject.getString("percent")
//
//                    val userData = UserData(id, email, price, amount, paymentNumber, tradesNo, percent)
//                    dataList.add(userData)
//                }
//                Toast.makeText(context, "$dataList", Toast.LENGTH_SHORT).show()
//                onDataReceived(dataList)
//            } catch (e: JSONException) {
//                Toast.makeText(context, "Error parsing JSON", Toast.LENGTH_SHORT).show()
//                e.printStackTrace()
//            }
//        },
//        Response.ErrorListener { error ->
//            Toast.makeText(context, "Error: ${error.message}", Toast.LENGTH_SHORT).show()
//        }
//    ) {
//        override fun getHeaders(): MutableMap<String, String> {
//            val headers = HashMap<String, String>()
//            headers["User-Agent"] = "Mozilla/5.0"
//            return headers
//        }
//    }
//
//    queue.add(stringRequest)
//}
//
//
////        greetings(context = this)
//
////    getContentFromReadPHP(context, userId) { data ->
////        dataList = data
//////                        onDataReceived(data)
////    }
//
//// ... (Preview and other code)
//
//
////@Preview(showBackground = true)
////@Composable
////fun () {
////     {
////        Greeting(context = LocalContext.current)
////    }
////}
////
//
//
//@Preview(showBackground = true)
//@Composable
//fun intentsScreenPreview(){
//    MVVMNavigationTheme {
//        IntentsScreen(rememberNavController())
//    }
//}