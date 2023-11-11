import React from "react";

export default function ThemeContextWrapper(props) {
  

  return (
    <>
      <div style={{ backgroundColor: "#1B1D2C", borderRadius: 10, overflow: "hidden" }}>
        <div style={{width: "100%"}}>
          <div style={{ backgroundColor: "#1B1D2C", opacity: 0.8, alignItems: "center", flexDirection: "row" }}>
            <p style={{width: "100%", margin: 15, marginLeft: 12}}>Calle 231 - Palermo</p>
          </div>
          <img
            alt="Imagen de evento"
            style={{width: "100%", borderRadius: 0}}
            src={require("../../assets/img/eventImg.png")}
          />
        </div>
      </div>
      <div style={{backgroundColor: "#1b1d2c", padding: 10}}>
        <div style={{width: "100%", justifyContent: "flex-end", display: "flex", marginTop: -40}}>

<button style={{border: "none",marginRight: -10, width: 160, height: 50, borderTopLeftRadius: 6, borderBottomLeftRadius: 6, backgroundColor: "#2A6CF6", justifyContent: "center", alignItems: "center"}}>
          <p style={{fontSize: 18, color: "#fff", fontWeight: 500}}>Asistir</p>
        </button>
        </div>
        <p style={{color: "#8D8D8D"}}>hace 14hs</p>
        <p style={{color: "#2A6CF6", fontSize: 20, fontWeight: 600}}>Feria Noviembre</p>
        <p style={{color: "#EEF0FA", fontSize: 15}}>Sabado 15/07/23 -- 14.20hs</p>
        
        <div style={{display: "flex", gap: 6,flexDirection: "row", justifyContent: "space-between"}}>
          <p style={{color: "#EEF0FA", fontSize: 12, flex: .7}}>
            Herramientas para la gestión de emprendimientos para que planifiquen
            su propio...
          </p>
          <p style={{flex: .3, lineHeight: 1, marginTop: -10}}>
            <span style={{fontWeight: 700, fontSize: 20}}>50</span>
            <br></br>personas mas asistiran a este evento
          </p>
        </div>
      </div>
    </>
  );
}