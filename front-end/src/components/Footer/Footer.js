import React from "react";

import { Container, Nav, NavItem, NavLink } from "reactstrap";

function Footer() {
  return (
    <footer className="footer">
      <Container fluid>
        <Nav>
          <NavItem>
            <NavLink href="https://www.mujeres2000.org.ar">
              Mujeres 2000
            </NavLink>
          </NavItem>
          
        </Nav>
      </Container>
    </footer>
  );
}

export default Footer;
