package ru.netology.fmhandroid.repository.patientRepository

import kotlinx.coroutines.flow.Flow
import ru.netology.fmhandroid.dto.*

interface PatientRepository {
    val data: Flow<List<Patient>>
    suspend fun getAllPatientsWithAdmissionStatus(status: Patient.Status) : Flow<List<Patient>>
    suspend fun getPatientById(patientId: Int) : Patient
    suspend fun savePatient(patient: Patient) : Patient
    suspend fun editPatient(patient: Patient) : Patient
    suspend fun getPatientAdmissions(patientId: Int) : List<Admission>
    suspend fun getPatientNotes(patientId: Int) : List<Note>
}