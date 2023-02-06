Public Class FrmDisplayRecords
    Dim total_marks As Short
    Dim studentname As String
    Dim Assignment1 As Short
    Dim Assignment2 As Short
    Dim Assignment3 As Short
    Dim Exam As Short
    Dim Allmarks As Short
    Dim grade As String
    Dim cao_points As Double
    Dim counter As Integer
    Dim student() As String
    Dim bestmark As Integer
    Dim c As Byte
    Dim worstmark As Integer
    Dim WorstStudent As String
    Dim BestStudent As String
    Dim sum As Single
    Dim average As Single
    
    Private Sub BtnMenu2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnMenu2.Click
        Me.Hide()
        FrmMenu.Show()
    End Sub

    Private Sub BtnDisplay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnDisplay.Click
        worstmark = 101
        On Error Resume Next

        FileOpen(1, My.Application.Info.DirectoryPath & "\results.DAT", OpenMode.Input)
        Do Until EOF(1)
            Input(1, studentname)
            Input(1, Assignment1)
            Input(1, Assignment2)
            Input(1, Assignment3)
            Input(1, Exam)
            Input(1, grade)
            Input(1, cao_points)

            ListBox1.Items.Add(studentname)
            ListBox2.Items.Add(Assignment1)
            ListBox3.Items.Add(Assignment2)
            ListBox4.Items.Add(Assignment3)
            ListBox5.Items.Add(Exam)
            ListBox7.Items.Add(grade)
            ListBox8.Items.Add(cao_points)

            Allmarks = Assignment1 + Assignment2 + Assignment3 + Exam
            TxtWorstMark.Text = studentname
            sum = sum + Allmarks
            ListBox6.Items.Add(Allmarks)
            'student(15) = Name

            If bestmark < Allmarks Then
                bestmark = Allmarks
                BestStudent = studentname
            End If

            If worstmark > Allmarks Then
                worstmark = Allmarks
                WorstStudent = studentname
            End If

            c = c + 1

            average = sum / c

            TxtAvgMark.Text = average
        Loop

        TxtBestStudent.Text = BestStudent
        TxtBestMark.Text = bestmark
        TxtWorstStudent.Text = WorstStudent
        TxtWorstMark.Text = worstmark
        FileClose(1)

    End Sub
End Class