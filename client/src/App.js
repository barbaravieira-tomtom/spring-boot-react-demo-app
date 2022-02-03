import logo from './logo.svg';
import './App.css';
import Users from './components/Users';

function App() {
  return (
    <div className="container-fluid">
      <nav>
        <div className="nav-wrapper center-align">
          <a href="/" className="brand-logo"/>
          </div>
      </nav>
      <div className ="row" >
        <Users />
      </div>
    </div>
  );
}

export default App;
