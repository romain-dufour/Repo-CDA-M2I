// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyDuLqmqLESjak5NGl5U5jr4ZDv4P_hEzHE",
  authDomain: "cda-m2i-81d7e.firebaseapp.com",
  databaseURL: "https://cda-m2i-81d7e-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "cda-m2i-81d7e",
  storageBucket: "cda-m2i-81d7e.appspot.com",
  messagingSenderId: "691306869877",
  appId: "1:691306869877:web:46d0b25c9429a9221db43c",
  measurementId: "G-ZFYC4GY92Y"
};

export const BASE_DB_URL = firebaseConfig.databaseURL
export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`


// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
