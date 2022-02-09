import './App.css';
import Header from './Header.js'
import {BrowserRouter as Router} from "react-router-dom";
import Checkout from "./Checkout.js";
import MyOrder from './MyOrder.js';

function App() {
  return (
    <Router>
    <div className="App">
     <Header />
     <MyOrder />
     {/* <Checkout/>  */}
    </div>
    </Router>
  );
}

export default App;
