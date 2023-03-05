import React, {useState, useEffect} from "react";

function App() {
  var [usd, setUSD] = useState(null);
  var [eur, setEUR] = useState(null);
  var [jpy, setJPY] = useState(null);
  const [value, setValue] = useState("Input");

  const rub = 1000
  const link = "http://0.0.0.0:8888/json/sum?amountRUB=" + rub

  useEffect(() => {
        fetch(link)
            .then(response => response.json())
            .then(response => setUSD(response.usd))
      }, []
  )
  useEffect(() => {
        fetch(link)
            .then(response => response.json())
            .then(response => setEUR(response.eur))
      }, []
  )
  useEffect(() => {
        fetch(link)
            .then(response => response.json())
            .then(response => setJPY(response.jpy))
      }, []
  )
    console.log(usd)
    console.log(eur)
    console.log(jpy)
  return (
    <div className="App">
        <p>
            usd -
          {
            !usd ? "Loading..." : usd
          }
        </p>
        <p>
            eur -
          {
            !eur ? "Loading..." : eur
          }
        </p>
        <p> jpy -
          {
            !jpy ? "Loading..." : jpy
          }
        </p>
        <h1>{value}</h1>
        <input
            type="text"
            value={value}
            onChange={event => setValue(event.target.value)}
        />
    </div>
  );
}

export default App;
