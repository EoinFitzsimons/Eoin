<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FrmMenu
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(FrmMenu))
        Me.BtnExit = New System.Windows.Forms.Button
        Me.BtnAddRecords = New System.Windows.Forms.Button
        Me.BtnShowRecords = New System.Windows.Forms.Button
        Me.PictureBox1 = New System.Windows.Forms.PictureBox
        Me.PictureBox2 = New System.Windows.Forms.PictureBox
        Me.PictureBox3 = New System.Windows.Forms.PictureBox
        Me.BtnHelp = New System.Windows.Forms.Button
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'BtnExit
        '
        Me.BtnExit.BackColor = System.Drawing.Color.White
        Me.BtnExit.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.BtnExit.ForeColor = System.Drawing.Color.SteelBlue
        Me.BtnExit.Location = New System.Drawing.Point(479, 403)
        Me.BtnExit.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.BtnExit.Name = "BtnExit"
        Me.BtnExit.Size = New System.Drawing.Size(187, 43)
        Me.BtnExit.TabIndex = 0
        Me.BtnExit.Text = "Exit"
        Me.BtnExit.UseVisualStyleBackColor = False
        '
        'BtnAddRecords
        '
        Me.BtnAddRecords.BackColor = System.Drawing.Color.White
        Me.BtnAddRecords.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.BtnAddRecords.ForeColor = System.Drawing.Color.SteelBlue
        Me.BtnAddRecords.Location = New System.Drawing.Point(479, 211)
        Me.BtnAddRecords.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.BtnAddRecords.Name = "BtnAddRecords"
        Me.BtnAddRecords.Size = New System.Drawing.Size(187, 43)
        Me.BtnAddRecords.TabIndex = 1
        Me.BtnAddRecords.Text = "Add Records"
        Me.BtnAddRecords.UseVisualStyleBackColor = False
        '
        'BtnShowRecords
        '
        Me.BtnShowRecords.BackColor = System.Drawing.Color.White
        Me.BtnShowRecords.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.BtnShowRecords.ForeColor = System.Drawing.Color.SteelBlue
        Me.BtnShowRecords.Location = New System.Drawing.Point(479, 307)
        Me.BtnShowRecords.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.BtnShowRecords.Name = "BtnShowRecords"
        Me.BtnShowRecords.Size = New System.Drawing.Size(187, 43)
        Me.BtnShowRecords.TabIndex = 2
        Me.BtnShowRecords.Text = "Show Records"
        Me.BtnShowRecords.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(12, 12)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(285, 116)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox1.TabIndex = 3
        Me.PictureBox1.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(848, 12)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(285, 116)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox2.TabIndex = 4
        Me.PictureBox2.TabStop = False
        '
        'PictureBox3
        '
        Me.PictureBox3.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox3.Image = CType(resources.GetObject("PictureBox3.Image"), System.Drawing.Image)
        Me.PictureBox3.Location = New System.Drawing.Point(655, 12)
        Me.PictureBox3.Name = "PictureBox3"
        Me.PictureBox3.Size = New System.Drawing.Size(285, 116)
        Me.PictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox3.TabIndex = 5
        Me.PictureBox3.TabStop = False
        '
        'BtnHelp
        '
        Me.BtnHelp.BackColor = System.Drawing.Color.White
        Me.BtnHelp.Font = New System.Drawing.Font("Orbitron Medium", 8.25!)
        Me.BtnHelp.ForeColor = System.Drawing.Color.SteelBlue
        Me.BtnHelp.Location = New System.Drawing.Point(12, 603)
        Me.BtnHelp.Name = "BtnHelp"
        Me.BtnHelp.Size = New System.Drawing.Size(43, 43)
        Me.BtnHelp.TabIndex = 6
        Me.BtnHelp.Text = "Help"
        Me.BtnHelp.UseVisualStyleBackColor = False
        '
        'FrmMenu
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.SteelBlue
        Me.ClientSize = New System.Drawing.Size(1145, 658)
        Me.Controls.Add(Me.BtnHelp)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.BtnShowRecords)
        Me.Controls.Add(Me.BtnAddRecords)
        Me.Controls.Add(Me.BtnExit)
        Me.Controls.Add(Me.PictureBox3)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!)
        Me.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.Name = "FrmMenu"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "FrmMenu"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents BtnExit As System.Windows.Forms.Button
    Friend WithEvents BtnAddRecords As System.Windows.Forms.Button
    Friend WithEvents BtnShowRecords As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox3 As System.Windows.Forms.PictureBox
    Friend WithEvents BtnHelp As System.Windows.Forms.Button
End Class
