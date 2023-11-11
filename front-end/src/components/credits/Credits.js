import React from "react";

export default function ThemeContextWrapper(props) {
  

  return (
    <>
      <div
        style={{
          backgroundColor: "#1B1D2C",
          borderRadius: 10,
          overflow: "hidden",
        }}
      >
        
          
      </div>
      <div style={{ backgroundColor: "#1b1d2c", padding: 10, borderRadius: 10 }}>
        <p style={{ color: "#ED751E", fontSize: 20, fontWeight: 600 }}>
          Solicitud de minicredito
        </p>
        
        <div
          style={{
            display: "flex",
            gap: 6,
            flexDirection: "row",
            justifyContent: "space-between",
          }}
        >
          <p style={{ color: "#EEF0FA", fontSize: 12, flex: 0.7 }}>
            Aqui puedes conseguir toda la informacion sobre como conseguir tus mini creditos y de que manera aplican!
          </p>

        </div>

        <div style={{ width: "100%", justifyContent: "flex-start", display: "flex", }} >
          <button style={{ border: "none", width: 160, height: 50, borderRadius: 10, backgroundColor: "#ED751E", justifyContent: "center", alignItems: "center", }} > <p style={{ fontSize: 18, color: "#fff", fontWeight: 500 }}> Solicitar </p> </button>
        </div>
      </div>
    </>
  );
}