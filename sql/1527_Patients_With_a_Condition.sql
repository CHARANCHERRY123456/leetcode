select patient_id ,patient_name ,conditions
from Patients
where (conditions != "") 
    and  (instr(conditions, 'DIAB1') = 1 
    or substr(conditions, instr(conditions, 'DIAB1')-1,1)=" " )
