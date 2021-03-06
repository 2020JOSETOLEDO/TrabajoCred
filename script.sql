USE [Informacion]
GO
/****** Object:  Table [dbo].[Calificaciones]   ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Calificaciones](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[estudiante] [varchar](30) NULL,
	[materia] [varchar](30) NULL,
	[Tipo_Cal] [varchar](30) NULL,
	[Calificacion1] [int] NULL,
	[Calificacion2] [int] NULL,
	[Calificacion3] [int] NULL,
	[Calificacion4] [int] NULL,
	[Calificacion5] [int] NULL,
	[Fecha_Cal] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
