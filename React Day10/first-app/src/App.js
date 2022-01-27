import './App.css';
import Greetings,{Hello} from './Greetings';
import Button,{Input, Simple} from './Button';
import {EmployeeItems} from './components/EmployeeCRUD';
import { EmployeeStore } from './components/EmployeeStore';
import { EmployeeOperations } from './components/EmployeeOperations';

function User(props){
return (<div>
  <h3>Name : {props.profile.username}, Age:{props.profile.age},Dob:{props.profile.dob.toLocaleDateString()}</h3>
</div>)
}
function Welcome(props){

  return(<div>
<h3>{props.message}</h3>
  </div>)
}

function App() {
  let message = 'hello everyone';
  let profile = {username:"praveen",age:"26",dob: new Date(1999,10,20)};
  let name = 'Surya Kumar';
  return (
    <div className="App">
     <h1>welcome to react JS</h1> 
     <Welcome message ={message}/>
     <User profile={profile}/>
     <Hello name={name}/>
     <Greetings firstname ='Naveen' lastname ='Polishetty' />
     <Button></Button>
     <Input></Input>
     <Simple/>
     <EmployeeItems/>
     <EmployeeStore></EmployeeStore>
     <EmployeeOperations></EmployeeOperations>
    </div>
  );
}

export default App;
